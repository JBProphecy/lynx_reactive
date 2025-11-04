package com.example.lynx.app.postgres.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lynx.app.postgres.objects.JaxProfileSession;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileSessionId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionId;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface JaxRepositoryProfileSession extends ReactiveCrudRepository<JaxProfileSession, JaxProfileSessionId> {
  public Mono<JaxProfileSession> findByProfileIdAndSessionId(JaxProfileId profileId, JaxSessionId sessionId);
  public Mono<Boolean> existsByProfileIdAndSessionId(JaxProfileId profileId, JaxSessionId sessionId);
  public Flux<JaxProfileSession> findByProfileId(JaxProfileId profileId);
  public Flux<JaxProfileSession> findBySessionId(JaxSessionId sessionId);
}
