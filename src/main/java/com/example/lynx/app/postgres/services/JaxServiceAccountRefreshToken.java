package com.example.lynx.app.postgres.services;

import org.springframework.stereotype.Service;

import com.example.lynx.app.postgres.objects.JaxAccountRefreshToken;
import com.example.lynx.app.postgres.repositories.JaxRepositoryAccountRefreshToken;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountRefreshTokenId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxHashedAccountRefreshTokenValue;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceAccountRefreshToken
{
  private final JaxRepositoryAccountRefreshToken repository;

  // ---------- Save & Delete ---------- //

  public Mono<JaxAccountRefreshToken> save(JaxAccountRefreshToken entity) {
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
