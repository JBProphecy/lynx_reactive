package com.example.lynx.app.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.lynx.app.api.constants.JaxRequestPathConstants;
import com.example.lynx.app.api.handlers.JaxHandlerGenerateSession;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class JaxRouterConfiguration
{
  private final JaxHandlerGenerateSession jaxHandlerGenerateSession;

  @Bean
  public RouterFunction<ServerResponse> jaxRouterApiSessions() {
    return RouterFunctions.route()
      .POST(RequestPredicates.path(JaxRequestPathConstants.API_SESSIONS), this.jaxHandlerGenerateSession::handleGenerateSessionRequest)
      .build();
  }
}
