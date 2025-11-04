package com.example.lynx.app.postgres.services;

import org.springframework.stereotype.Service;

import com.example.lynx.app.postgres.objects.JaxProfileRefreshToken;
import com.example.lynx.app.postgres.repositories.JaxRepositoryProfileRefreshToken;
import com.example.lynx.back.packages.generation.wrapper.output.JaxHashedProfileRefreshTokenValue;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileRefreshTokenId;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceProfileRefreshToken
{
  private final JaxRepositoryProfileRefreshToken repository;

  // ---------- Save & Delete ---------- //

  public Mono<JaxProfileRefreshToken> save(JaxProfileRefreshToken entity) {
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
