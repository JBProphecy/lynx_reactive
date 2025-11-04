package com.example.lynx.app.postgres.services;

import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Service;

import com.example.lynx.app.postgres.objects.JaxAccountSession;
import com.example.lynx.app.postgres.repositories.JaxRepositoryAccountSession;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountSessionId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionId;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceAccountSession
{
  private final JaxRepositoryAccountSession repository;
  private final R2dbcEntityTemplate template;

  // ---------- Insert, Update, Delete ---------- //

  public Mono<JaxAccountSession> insert(JaxAccountSession entity) {
    return this.template.insert(entity);
  }

  public Mono<JaxAccountSession> update(JaxAccountSession entity) {
    return this.repository.save(JaxAccountSession.require(entity));
  }

  public Mono<Void> delete(JaxAccountSession entity) {
    return this.repository.delete(JaxAccountSession.require(entity));
  }

  // ---------- By Id ---------- //

  public Mono<JaxAccountSession> findById(JaxAccountSessionId id) {
    return this.repository.findById(JaxAccountSessionId.require(id));
  }

  public Mono<Boolean> existsById(JaxAccountSessionId id) {
    return this.repository.existsById(JaxAccountSessionId.require(id));
  }

  public Mono<Void> deleteById(JaxAccountSessionId id) {
    return this.repository.deleteById(JaxAccountSessionId.require(id));
  }

  // ---------- By Account Id and Session Id ---------- //

  public Mono<JaxAccountSession> findByAccountIdAndSessionId(JaxAccountId accountId, JaxSessionId sessionId) {
    return this.repository.findByAccountIdAndSessionId(JaxAccountId.require(accountId), JaxSessionId.require(sessionId));
  }

  public Mono<Boolean> existsByAccountIdAndSessionId(JaxAccountId accountId, JaxSessionId sessionId) {
    return this.repository.existsByAccountIdAndSessionId(JaxAccountId.require(accountId), JaxSessionId.require(sessionId));
  }

  // ---------- By Account Id ---------- //

  public Flux<JaxAccountSession> findByAccountId(JaxAccountId accountId) {
    return this.repository.findByAccountId(JaxAccountId.require(accountId));
  }

  // ---------- By Session Id ---------- //

  public Flux<JaxAccountSession> findBySessionId(JaxSessionId sessionId) {
    return this.repository.findBySessionId(JaxSessionId.require(sessionId));
  }
}
