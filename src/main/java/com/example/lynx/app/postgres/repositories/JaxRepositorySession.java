package com.example.lynx.app.postgres.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lynx.app.postgres.objects.JaxSession;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionId;

@Repository
public interface JaxRepositorySession extends ReactiveCrudRepository<JaxSession, JaxSessionId> {}
