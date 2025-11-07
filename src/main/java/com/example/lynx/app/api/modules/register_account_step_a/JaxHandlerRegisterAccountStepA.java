package com.example.lynx.app.api.modules.register_account_step_a;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.lynx.app.wrapper.email.JaxAccountEmail;
import com.example.lynx.app.wrapper.password.JaxActualAccountPassword;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountName;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public final class JaxHandlerRegisterAccountStepA
{
  private final JaxServiceRegisterAccountStepA jaxServiceRegisterAccountStepA;

  public Mono<ServerResponse> handleRequestRegisterAccountStepA(ServerRequest request) {
    return request.bodyToMono(JaxRequestBodyRegisterAccountStepA.class)
    .flatMap(requestBody -> {
      final JaxAccountName name = JaxAccountName.assign(requestBody.getName());
      final JaxAccountEmail email = JaxAccountEmail.assign(requestBody.getEmail());
      final JaxActualAccountPassword password = JaxActualAccountPassword.assign(requestBody.getPassword());
      return this.jaxServiceRegisterAccountStepA.process(name, email, password);
    })
    .flatMap(emailVerificationToken -> {
      final JaxResponseBodyContentRegisterAccountStepA responseBodyContent = new JaxResponseBodyContentRegisterAccountStepA(emailVerificationToken);
      return ServerResponse.status(200).bodyValue(responseBodyContent);
    });
  }
}
