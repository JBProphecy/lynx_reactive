package com.example.lynx.app.postgres.services;

import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Service;

import com.example.lynx.app.postgres.objects.JaxProfileSession;
import com.example.lynx.app.postgres.repositories.JaxRepositoryProfileSession;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileSessionId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionId;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceProfileSession
{
  private final JaxRepositoryProfileSession repository;
  private final R2dbcEntityTemplate template;

  // ---------- Insert, Update, Delete ---------- //

  public Mono<JaxProfileSession> insert(JaxProfileSession entity) {
    return this.template.insert(entity);
  }

  public Mono<JaxProfileSession> update(JaxProfileSession entity) {
    return this.repository.save(JaxProfileSession.require(entity));
  }

  public Mono<Void> delete(JaxProfileSession entity) {
    return this.repository.delete(JaxProfileSession.require(entity));
  }

  // ---------- By Id ---------- //

  public Mono<JaxProfileSession> findById(JaxProfileSessionId id) {
    return this.repository.findById(JaxProfileSessionId.require(id));
  }

  public Mono<Boolean> existsById(JaxProfileSessionId id) {
    return this.repository.existsById(JaxProfileSessionId.require(id));
  }

  public Mono<Void> deleteById(JaxProfileSessionId id) {
    return this.repository.deleteById(JaxProfileSessionId.require(id));
  }

  // ---------- By Profile Id and Session Id ---------- //

  public Mono<JaxProfileSession> findByProfileIdAndSessionId(JaxProfileId profileId, JaxSessionId sessionId) {
    return this.repository.findByProfileIdAndSessionId(JaxProfileId.require(profileId), JaxSessionId.require(sessionId));
  }

  public Mono<Boolean> existsByProfileIdAndSessionId(JaxProfileId profileId, JaxSessionId sessionId) {
    return this.repository.existsByProfileIdAndSessionId(JaxProfileId.require(profileId), JaxSessionId.require(sessionId));
  }

  // ---------- By Profile Id ---------- //

  public Flux<JaxProfileSession> findByProfileId(JaxProfileId profileId) {
    return this.repository.findByProfileId(JaxProfileId.require(profileId));
  }

  // ---------- By Session Id ---------- //

  public Flux<JaxProfileSession> findBySessionId(JaxSessionId sessionId) {
    return this.repository.findBySessionId(JaxSessionId.require(sessionId));
  }
}
