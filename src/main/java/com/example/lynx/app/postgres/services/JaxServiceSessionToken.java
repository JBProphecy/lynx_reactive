package com.example.lynx.app.postgres.services;

import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Service;

import com.example.lynx.app.postgres.objects.JaxSessionToken;
import com.example.lynx.app.postgres.repositories.JaxRepositorySessionToken;
import com.example.lynx.app.wrapper.opaque.token.value.JaxHashedSessionTokenValue;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionTokenId;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceSessionToken
{
  private final JaxRepositorySessionToken repository;
  private final R2dbcEntityTemplate template;

  // ---------- Insert, Update, Delete ---------- //

  public Mono<JaxSessionToken> insert(JaxSessionToken entity) {
    return this.template.insert(entity);
  }

  public Mono<JaxSessionToken> update(JaxSessionToken entity) {
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
