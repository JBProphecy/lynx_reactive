package com.example.lynx.app.postgres.services;

import org.springframework.stereotype.Service;

import com.example.lynx.app.postgres.objects.JaxSessionToken;
import com.example.lynx.app.postgres.repositories.JaxRepositorySessionToken;
import com.example.lynx.back.packages.generation.wrapper.output.JaxHashedSessionTokenValue;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionTokenId;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceSessionToken
{
  private final JaxRepositorySessionToken repository;

  // ---------- Save & Delete ---------- //

  public Mono<JaxSessionToken> save(JaxSessionToken entity) {
    return this.repository.save(JaxSessionToken.require(entity));
  }

  public Mono<Void> delete(JaxSessionToken entity) {
    return this.repository.delete(JaxSessionToken.require(entity));
  }

  // ---------- By Id ---------- //

  public Mono<JaxSessionToken> findById(JaxSessionTokenId id) {
    return this.repository.findById(JaxSessionTokenId.require(id));
  }

  public Mono<Boolean> existsById(JaxSessionTokenId id) {
    return this.repository.existsById(JaxSessionTokenId.require(id));
  }

  public Mono<Void> deleteById(JaxSessionTokenId id) {
    return this.repository.deleteById(JaxSessionTokenId.require(id));
  }

  // ---------- By Value ---------- //

  public Mono<JaxSessionToken> findByValue(JaxHashedSessionTokenValue value) {
    return this.repository.findByValue(JaxHashedSessionTokenValue.require(value));
  }

  public Mono<Boolean> existsByValue(JaxHashedSessionTokenValue value) {
    return this.repository.existsByValue(JaxHashedSessionTokenValue.require(value));
  }
}
