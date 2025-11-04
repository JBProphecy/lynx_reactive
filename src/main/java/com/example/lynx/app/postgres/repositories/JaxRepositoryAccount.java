package com.example.lynx.app.postgres.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lynx.app.postgres.objects.JaxAccount;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountEmail;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountId;

import reactor.core.publisher.Mono;

@Repository
public interface JaxRepositoryAccount extends ReactiveCrudRepository<JaxAccount, JaxAccountId> {
  public Mono<JaxAccount> findByEmail(JaxAccountEmail email);
  public Mono<Boolean> existsByEmail(JaxAccountEmail email);
}
