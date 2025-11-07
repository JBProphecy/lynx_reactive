package com.example.lynx.app.api.routers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.lynx.app.api.constants.JaxRequestPathConstants;
import com.example.lynx.app.api.modules.generate_session.JaxHandlerGenerateSession;
import com.example.lynx.app.api.modules.register_account_step_a.JaxHandlerRegisterAccountStepA;
import com.example.lynx.app.api.modules.register_account_step_b.JaxHandlerRegisterAccountStepB;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class JaxRouterConfiguration
{
  private final JaxHandlerGenerateSession jaxHandlerGenerateSession;
  private final JaxHandlerRegisterAccountStepA jaxHandlerRegisterAccountStepA;
  private final JaxHandlerRegisterAccountStepB jaxHandlerRegisterAccountStepB;

  @Bean
  public RouterFunction<ServerResponse> jaxRouterApiSessions() {
    return RouterFunctions.route()
      .POST(RequestPredicates.path(JaxRequestPathConstants.API_SESSIONS), this.jaxHandlerGenerateSession::handleRequestGenerateSession)
      .build();
  }

  @Bean
  public RouterFunction<ServerResponse> jaxRouterApiAccountsRegister() {
    return RouterFunctions.route()
      .POST(RequestPredicates.path(JaxRequestPathConstants.API_ACCOUNTS_REGISTER), this.jaxHandlerRegisterAccountStepA::handleRequestRegisterAccountStepA)
      .build();
  }

  @Bean
  public RouterFunction<ServerResponse> jaxRouterApiAccountsRegisterVerifyEmail() {
    return RouterFunctions.route()
      .POST(RequestPredicates.path(JaxRequestPathConstants.API_ACCOUNTS_REGISTER_VERIFY_EMAIL), this.jaxHandlerRegisterAccountStepB::handleRequestRegisterAccountStepB)
      .build();
  }
}
