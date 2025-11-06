package com.example.lynx.app.redis.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.stereotype.Service;

import com.example.lynx.app.constants.JaxAppConstants;
import com.example.lynx.app.redis.models.JaxTemporaryAccountCache;
import com.example.lynx.app.wrapper.opaque.token.value.JaxEmailVerificationToken;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceTemporaryAccount
{
  @Qualifier("jaxReactiveRedisTemplateTemporaryAccountCache")
  private final ReactiveRedisTemplate<String, JaxTemporaryAccountCache> reactiveRedisTemplate;

  private final String buildKey(JaxEmailVerificationToken emailVerificationToken) {
    return "temporary-account:email-verification-token:" + JaxEmailVerificationToken.extract(emailVerificationToken);
  }

  public Mono<Boolean> save(JaxEmailVerificationToken emailVerificationToken, JaxTemporaryAccountCache temporaryAccountCache) {
    return this.reactiveRedisTemplate.opsForValue().set(
      this.buildKey(emailVerificationToken),
      temporaryAccountCache,
      JaxAppConstants.EMAIL_VERIFICATION_WINDOW_MINUTES
    );
  }

  public Mono<JaxTemporaryAccountCache> get(JaxEmailVerificationToken emailVerificationToken) {
    return this.reactiveRedisTemplate.opsForValue().get(this.buildKey(emailVerificationToken));
  }
  
  public Mono<Boolean> delete(JaxEmailVerificationToken emailVerificationToken) {
    return this.reactiveRedisTemplate.opsForValue().delete(this.buildKey(emailVerificationToken));
  }
}
