package com.example.lynx.app.postgres.services;

import org.springframework.stereotype.Service;

import com.example.lynx.app.postgres.objects.JaxSession;
import com.example.lynx.app.postgres.repositories.JaxRepositorySession;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionId;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceSession
{
  private final JaxRepositorySession repository;

  // ---------- Save & Delete ---------- //

  public Mono<JaxSession> save(JaxSession entity) {
    return this.repository.save(JaxSession.require(entity));
  }

  public Mono<Void> delete(JaxSession entity) {
    return this.repository.delete(JaxSession.require(entity));
  }

  // ---------- By Id ---------- //

  public Mono<JaxSession> findById(JaxSessionId id) {
    return this.repository.findById(JaxSessionId.require(id));
  }

  public Mono<Boolean> existsById(JaxSessionId id) {
    return this.repository.existsById(JaxSessionId.require(id));
  }

  public Mono<Void> deleteById(JaxSessionId id) {
    return this.repository.deleteById(JaxSessionId.require(id));
  }
}
