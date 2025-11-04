package com.example.lynx.app.api.handlers;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.lynx.app.api.services.JaxServiceGenerateSession;
import com.example.lynx.app.response.body.JaxResponseBodyContentGenerateSession;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class JaxHandlerGenerateSession
{
  private final JaxServiceGenerateSession jaxSessionHandlerService;

  public Mono<ServerResponse> handleGenerateSessionRequest(ServerRequest request) {
    return this.jaxSessionHandlerService.generate().flatMap(actualSessionTokenValue -> {
      final JaxResponseBodyContentGenerateSession responseBodyContent = new JaxResponseBodyContentGenerateSession(actualSessionTokenValue);
      return ServerResponse.status(201).bodyValue(responseBodyContent);
    });
  }
}
