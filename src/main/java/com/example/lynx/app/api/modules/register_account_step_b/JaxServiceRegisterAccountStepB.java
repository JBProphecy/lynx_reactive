package com.example.lynx.app.api.modules.register_account_step_b;

import org.springframework.stereotype.Component;

import com.example.lynx.app.api.exceptions.JaxAccountAlreadyRegisteredException;
import com.example.lynx.app.api.exceptions.JaxInvalidEmailVerificationCodeException;
import com.example.lynx.app.postgres.objects.JaxAccount;
import com.example.lynx.app.postgres.services.JaxServiceAccount;
import com.example.lynx.app.redis.models.JaxTemporaryAccountCache;
import com.example.lynx.app.redis.services.JaxServiceTemporaryAccount;
import com.example.lynx.app.services.JaxAccountEmailVerificationService;
import com.example.lynx.app.wrapper.opaque.token.value.JaxEmailVerificationToken;
import com.example.lynx.back.packages.generation.wrapper.output.JaxEmailVerificationCode;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public final class JaxServiceRegisterAccountStepB
{
  private final JaxServiceTemporaryAccount jaxServiceTemporaryAccount;
  private final JaxAccountEmailVerificationService jaxAccountEmailVerificationService;
  private final JaxServiceAccount jaxServiceAccount;

  private Mono<Void> ensureEmailVerificationCodesMatch(JaxEmailVerificationCode code, JaxTemporaryAccountCache cache) {
    final boolean matches = this.jaxAccountEmailVerificationService.checkDoEmailVerificationCodesMatch(code, cache.getCode());
    return matches ? Mono.empty() : Mono.error(JaxInvalidEmailVerificationCodeException.generate());
  }

  private Mono<Boolean> deleteTemporaryAccountCache(JaxEmailVerificationToken emailVerificationToken) {
    return this.jaxServiceTemporaryAccount.delete(emailVerificationToken);
  }

  private Mono<Void> ensureAccountIsNotRegistered(JaxTemporaryAccountCache cache) {
    return this.jaxServiceAccount.existsByEmail(cache.getEmail()).flatMap(registered ->
      registered ? Mono.error(JaxAccountAlreadyRegisteredException.generate()) : Mono.empty()
    );
  }

  private Mono<JaxAccount> registerAccount(JaxTemporaryAccountCache cache) {
    final JaxAccount account = JaxAccount.create(cache);
    return this.jaxServiceAccount.insert(account);
  }

  public Mono<Void> process(JaxEmailVerificationToken emailVerificationToken, JaxEmailVerificationCode emailVerificationCode) {
    return Mono.defer(() ->
      this.jaxServiceTemporaryAccount.get(emailVerificationToken)
      .switchIfEmpty(Mono.error(JaxInvalidEmailVerificationCodeException.generate()))
      .flatMap(temporaryAccountCache ->
        this.ensureEmailVerificationCodesMatch(emailVerificationCode, temporaryAccountCache)
          .then(this.deleteTemporaryAccountCache(emailVerificationToken))
          .then(this.ensureAccountIsNotRegistered(temporaryAccountCache))
          .then(this.registerAccount(temporaryAccountCache))
          .then(Mono.empty())
      )
    );
  }
}
