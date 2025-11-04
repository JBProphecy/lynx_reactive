package com.example.lynx.app.postgres.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lynx.app.postgres.objects.JaxSessionToken;
import com.example.lynx.app.wrapper.opaque.token.value.JaxHashedSessionTokenValue;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionTokenId;

import reactor.core.publisher.Mono;

@Repository
public interface JaxRepositorySessionToken extends ReactiveCrudRepository<JaxSessionToken, JaxSessionTokenId> {
  public Mono<JaxSessionToken> findByValue(JaxHashedSessionTokenValue value);
  public Mono<Boolean> existsByValue(JaxHashedSessionTokenValue value);
}
