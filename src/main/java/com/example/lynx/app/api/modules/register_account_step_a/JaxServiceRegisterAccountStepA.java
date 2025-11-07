package com.example.lynx.app.api.modules.register_account_step_a;

import org.springframework.stereotype.Service;

import com.example.lynx.app.postgres.services.JaxServiceAccount;
import com.example.lynx.app.redis.models.JaxTemporaryAccountCache;
import com.example.lynx.app.redis.services.JaxServiceTemporaryAccount;
import com.example.lynx.app.services.JaxAccountEmailVerificationService;
import com.example.lynx.app.services.JaxPasswordService;
import com.example.lynx.app.wrapper.email.JaxAccountEmail;
import com.example.lynx.app.wrapper.opaque.token.value.JaxEmailVerificationToken;
import com.example.lynx.app.wrapper.password.JaxActualAccountPassword;
import com.example.lynx.app.wrapper.password.JaxHashedAccountPassword;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountName;
import com.example.lynx.back.packages.generation.wrapper.output.JaxEmailVerificationCode;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceRegisterAccountStepA
{
  private final JaxServiceAccount jaxServiceAccount;
  private final JaxAccountEmailVerificationService jaxAccountEmailVerificationService;
  private final JaxPasswordService jaxPasswordService;
  private final JaxServiceTemporaryAccount jaxServiceTemporaryAccount;

  public Mono<JaxEmailVerificationToken> process(JaxAccountName accountName, JaxAccountEmail accountEmail, JaxActualAccountPassword actualAccountPassword) {
    final JaxEmailVerificationToken emailVerificationToken = JaxEmailVerificationToken.generate();
    return this.jaxServiceAccount.existsByEmail(accountEmail).flatMap(exists -> exists
      ? this.jaxAccountEmailVerificationService.sendEmailUnavailableEmail(accountEmail).then(Mono.just(emailVerificationToken))
      : Mono.defer(() -> {
          final JaxEmailVerificationCode emailVerificationCode = JaxEmailVerificationCode.generate();
          final JaxHashedAccountPassword hashedAccountPassword = this.jaxPasswordService.hash(actualAccountPassword);
          return this.jaxServiceTemporaryAccount.save(emailVerificationToken, new JaxTemporaryAccountCache(emailVerificationCode, accountName, accountEmail, hashedAccountPassword))
          .then(this.jaxAccountEmailVerificationService.sendVerificationCodeEmail(accountEmail, emailVerificationToken, emailVerificationCode))
          .then(Mono.just(emailVerificationToken));
      })
    );
  }
}
