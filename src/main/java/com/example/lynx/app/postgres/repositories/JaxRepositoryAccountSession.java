package com.example.lynx.app.postgres.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lynx.app.postgres.objects.JaxAccountSession;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountSessionId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionId;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface JaxRepositoryAccountSession extends ReactiveCrudRepository<JaxAccountSession, JaxAccountSessionId> {
  public Mono<JaxAccountSession> findByAccountIdAndSessionId(JaxAccountId accountId, JaxSessionId sessionId);
  public Mono<Boolean> existsByAccountIdAndSessionId(JaxAccountId accountId, JaxSessionId sessionId);
  public Flux<JaxAccountSession> findByAccountId(JaxAccountId accountId);
  public Flux<JaxAccountSession> findBySessionId(JaxSessionId sessionId);
}
