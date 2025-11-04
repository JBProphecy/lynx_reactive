package com.example.lynx.app.postgres.services;

import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Service;

import com.example.lynx.app.postgres.objects.JaxProfileRefreshToken;
import com.example.lynx.app.postgres.repositories.JaxRepositoryProfileRefreshToken;
import com.example.lynx.app.wrapper.opaque.token.value.JaxHashedProfileRefreshTokenValue;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileRefreshTokenId;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceProfileRefreshToken
{
  private final JaxRepositoryProfileRefreshToken repository;
  private final R2dbcEntityTemplate template;

  // ---------- Insert, Update, Delete ---------- //

  public Mono<JaxProfileRefreshToken> insert(JaxProfileRefreshToken entity) {
    return this.template.insert(entity);
  }

  public Mono<JaxProfileRefreshToken> update(JaxProfileRefreshToken entity) {
    return this.repository.save(JaxProfileRefreshToken.require(entity));
  }

  public Mono<Void> delete(JaxProfileRefreshToken entity) {
    return this.repository.delete(JaxProfileRefreshToken.require(entity));
  }

  // ---------- By Id ---------- //

  public Mono<JaxProfileRefreshToken> findById(JaxProfileRefreshTokenId id) {
    return this.repository.findById(JaxProfileRefreshTokenId.require(id));
  }

  public Mono<Boolean> existsById(JaxProfileRefreshTokenId id) {
    return this.repository.existsById(JaxProfileRefreshTokenId.require(id));
  }

  public Mono<Void> deleteById(JaxProfileRefreshTokenId id) {
    return this.repository.deleteById(JaxProfileRefreshTokenId.require(id));
  }

  // ---------- By Value ---------- //

  public Mono<JaxProfileRefreshToken> findByValue(JaxHashedProfileRefreshTokenValue value) {
    return this.repository.findByValue(JaxHashedProfileRefreshTokenValue.require(value));
  }

  public Mono<Boolean> existsByValue(JaxHashedProfileRefreshTokenValue value) {
    return this.repository.existsByValue(JaxHashedProfileRefreshTokenValue.require(value));
  }
}
