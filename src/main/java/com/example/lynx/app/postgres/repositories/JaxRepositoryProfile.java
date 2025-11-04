package com.example.lynx.app.postgres.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lynx.app.postgres.objects.JaxProfile;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileUsername;

import reactor.core.publisher.Mono;

@Repository
public interface JaxRepositoryProfile extends ReactiveCrudRepository<JaxProfile, JaxProfileId> {
  public Mono<JaxProfile> findByUsername(JaxProfileUsername username);
  public Mono<Boolean> existsByUsername(JaxProfileUsername username);
}
