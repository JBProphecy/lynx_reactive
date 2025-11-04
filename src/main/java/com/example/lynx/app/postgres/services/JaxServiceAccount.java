package com.example.lynx.app.postgres.services;

import org.springframework.stereotype.Service;

import com.example.lynx.app.postgres.objects.JaxAccount;
import com.example.lynx.app.postgres.repositories.JaxRepositoryAccount;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountEmail;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountId;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceAccount
{
  private final JaxRepositoryAccount repository;

  // ---------- Save & Delete ---------- //

  public Mono<JaxAccount> save(JaxAccount entity) {
    return this.repository.save(JaxAccount.require(entity));
  }

  public Mono<Void> delete(JaxAccount entity) {
    return this.repository.delete(JaxAccount.require(entity));
  }

  // ---------- By Id ---------- //

  public Mono<JaxAccount> findById(JaxAccountId id) {
    return this.repository.findById(JaxAccountId.require(id));
  }

  public Mono<Boolean> existsById(JaxAccountId id) {
    return this.repository.existsById(JaxAccountId.require(id));
  }

  public Mono<Void> deleteById(JaxAccountId id) {
    return this.repository.deleteById(JaxAccountId.require(id));
  }

  // ---------- By Email ---------- //

  public Mono<JaxAccount> findByEmail(JaxAccountEmail email) {
    return this.repository.findByEmail(JaxAccountEmail.require(email));
  }

  public Mono<Boolean> existsByEmail(JaxAccountEmail email) {
    return this.repository.existsByEmail(JaxAccountEmail.require(email));
  }
}
