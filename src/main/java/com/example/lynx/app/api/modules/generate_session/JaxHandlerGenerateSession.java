package com.example.lynx.app.api.modules.generate_session;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public final class JaxHandlerGenerateSession
{
  private final JaxServiceGenerateSession jaxSessionHandlerService;

  public Mono<ServerResponse> handleRequestGenerateSession(ServerRequest request) {
    return this.jaxSessionHandlerService.generate().flatMap(actualSessionTokenValue -> {
      final JaxResponseBodyContentGenerateSession responseBodyContent = new JaxResponseBodyContentGenerateSession(actualSessionTokenValue);
      return ServerResponse.status(201).bodyValue(responseBodyContent);
    });
  }
}
