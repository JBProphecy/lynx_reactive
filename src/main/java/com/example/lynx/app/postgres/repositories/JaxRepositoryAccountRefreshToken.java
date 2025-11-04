package com.example.lynx.app.postgres.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lynx.app.postgres.objects.JaxAccountRefreshToken;
import com.example.lynx.app.wrapper.opaque.token.value.JaxHashedAccountRefreshTokenValue;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountRefreshTokenId;

import reactor.core.publisher.Mono;

@Repository
public interface JaxRepositoryAccountRefreshToken extends ReactiveCrudRepository<JaxAccountRefreshToken, JaxAccountRefreshTokenId> {
  public Mono<JaxAccountRefreshToken> findByValue(JaxHashedAccountRefreshTokenValue value);
  public Mono<Boolean> existsByValue(JaxHashedAccountRefreshTokenValue value);
}
