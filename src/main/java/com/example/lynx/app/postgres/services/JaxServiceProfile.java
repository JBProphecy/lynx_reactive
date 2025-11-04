package com.example.lynx.app.postgres.services;

import org.springframework.stereotype.Service;

import com.example.lynx.app.postgres.objects.JaxProfile;
import com.example.lynx.app.postgres.repositories.JaxRepositoryProfile;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileUsername;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceProfile
{
  private final JaxRepositoryProfile repository;

  // ---------- Save & Delete ---------- //

  public Mono<JaxProfile> save(JaxProfile entity) {
    return this.repository.save(JaxProfile.require(entity));
  }

  public Mono<Void> delete(JaxProfile entity) {
    return this.repository.delete(JaxProfile.require(entity));
  }

  // ---------- By Id ---------- //

  public Mono<JaxProfile> findById(JaxProfileId id) {
    return this.repository.findById(JaxProfileId.require(id));
  }

  public Mono<Boolean> existsById(JaxProfileId id) {
    return this.repository.existsById(JaxProfileId.require(id));
  }

  public Mono<Void> deleteById(JaxProfileId id) {
    return this.repository.deleteById(JaxProfileId.require(id));
  }

  // ---------- By Username ---------- //

  public Mono<JaxProfile> findByUsername(JaxProfileUsername username) {
    return this.repository.findByUsername(JaxProfileUsername.require(username));
  }

  public Mono<Boolean> existsByUsername(JaxProfileUsername username) {
    return this.repository.existsByUsername(JaxProfileUsername.require(username));
  }
}