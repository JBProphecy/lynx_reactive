package com.example.lynx.app.api.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.lynx.app.postgres.objects.JaxSession;
import com.example.lynx.app.postgres.objects.JaxSessionToken;
import com.example.lynx.app.postgres.services.JaxServiceSession;
import com.example.lynx.app.postgres.services.JaxServiceSessionToken;
import com.example.lynx.app.wrapper.opaque.token.value.JaxActualSessionTokenValue;
import com.example.lynx.app.wrapper.opaque.token.value.JaxHashedSessionTokenValue;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class JaxServiceGenerateSession
{
  private final JaxServiceSession jaxServiceSession;
  private final JaxServiceSessionToken jaxServiceSessionToken;

  @Transactional
  public Mono<JaxActualSessionTokenValue> generate() {
    final JaxActualSessionTokenValue actualSessionTokenValue = JaxActualSessionTokenValue.generate();
    final JaxHashedSessionTokenValue hashedSessionTokenValue = actualSessionTokenValue.hash();
    final JaxSession session = JaxSession.create();
    final JaxSessionToken sessionToken = JaxSessionToken.create(session.getId(), hashedSessionTokenValue);
    return
      this.jaxServiceSession.insert(session)
      .then(this.jaxServiceSessionToken.insert(sessionToken))
      .then(Mono.just(actualSessionTokenValue));
  }
}
