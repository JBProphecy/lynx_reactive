package com.example.lynx.app.api.modules.register_account_step_b;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.lynx.app.wrapper.opaque.token.value.JaxEmailVerificationToken;
import com.example.lynx.back.packages.generation.wrapper.output.JaxEmailVerificationCode;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public final class JaxHandlerRegisterAccountStepB
{
  private final JaxServiceRegisterAccountStepB jaxServiceRegisterAccountStepB;

  public Mono<ServerResponse> handleRequestRegisterAccountStepB(ServerRequest request) {
    return request.bodyToMono(JaxRequestBodyRegisterAccountStepB.class)
    .flatMap(requestBody -> {
      final JaxEmailVerificationToken emailVerificationToken = JaxEmailVerificationToken.assign(requestBody.getToken());
      final JaxEmailVerificationCode emailVerificationCode = JaxEmailVerificationCode.assign(requestBody.getCode());
      return this.jaxServiceRegisterAccountStepB.process(emailVerificationToken, emailVerificationCode);
    })
    .then(Mono.defer(() -> {
      final JaxResponseBodyContentRegisterAccountStepB responseBodyContent = new JaxResponseBodyContentRegisterAccountStepB("Your account has been registered.");
      return ServerResponse.status(201).bodyValue(responseBodyContent);
    }));
  }
}
