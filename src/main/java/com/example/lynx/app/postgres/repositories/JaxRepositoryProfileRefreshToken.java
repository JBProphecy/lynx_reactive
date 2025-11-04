package com.example.lynx.app.postgres.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lynx.app.postgres.objects.JaxProfileRefreshToken;
import com.example.lynx.app.wrapper.opaque.token.value.JaxHashedProfileRefreshTokenValue;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileRefreshTokenId;

import reactor.core.publisher.Mono;

@Repository
public interface JaxRepositoryProfileRefreshToken extends ReactiveCrudRepository<JaxProfileRefreshToken, JaxProfileRefreshTokenId> {
  public Mono<JaxProfileRefreshToken> findByValue(JaxHashedProfileRefreshTokenValue value);
  public Mono<Boolean> existsByValue(JaxHashedProfileRefreshTokenValue value);
}
