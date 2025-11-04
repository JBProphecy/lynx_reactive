package com.example.lynx.app.postgres.services;

import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Service;

import com.example.lynx.app.postgres.objects.JaxAccountRefreshToken;
import com.example.lynx.app.postgres.repositories.JaxRepositoryAccountRefreshToken;
import com.example.lynx.app.wrapper.opaque.token.value.JaxHashedAccountRefreshTokenValue;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountRefreshTokenId;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceAccountRefreshToken
{
  private final JaxRepositoryAccountRefreshToken repository;
  private final R2dbcEntityTemplate template;

  // ---------- Insert, Update, Delete ---------- //

  public Mono<JaxAccountRefreshToken> insert(JaxAccountRefreshToken entity) {
    return this.template.insert(entity);
  }

  public Mono<JaxAccountRefreshToken> update(JaxAccountRefreshToken entity) {
    return this.repository.save(JaxAccountRefreshToken.require(entity));
  }

  public Mono<Void> delete(JaxAccountRefreshToken entity) {
    return this.repository.delete(JaxAccountRefreshToken.require(entity));
  }

  // ---------- By Id ---------- //

  public Mono<JaxAccountRefreshToken> findById(JaxAccountRefreshTokenId id) {
    return this.repository.findById(JaxAccountRefreshTokenId.require(id));
  }

  public Mono<Boolean> existsById(JaxAccountRefreshTokenId id) {
    return this.repository.existsById(JaxAccountRefreshTokenId.require(id));
  }

  public Mono<Void> deleteById(JaxAccountRefreshTokenId id) {
    return this.repository.deleteById(JaxAccountRefreshTokenId.require(id));
  }

  // ---------- By Value ---------- //

  public Mono<JaxAccountRefreshToken> findByValue(JaxHashedAccountRefreshTokenValue value) {
    return this.repository.findByValue(JaxHashedAccountRefreshTokenValue.require(value));
  }

  public Mono<Boolean> existsByValue(JaxHashedAccountRefreshTokenValue value) {
    return this.repository.existsByValue(JaxHashedAccountRefreshTokenValue.require(value));
  }
}
