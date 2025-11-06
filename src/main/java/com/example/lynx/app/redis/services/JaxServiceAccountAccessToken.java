package com.example.lynx.app.redis.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.stereotype.Service;

import com.example.lynx.app.configuration.tokens.JaxTokenProperties.JaxAccountAccessTokenProperties;
import com.example.lynx.app.redis.models.JaxAccountAccessTokenCache;
import com.example.lynx.app.wrapper.opaque.token.value.JaxAccountAccessTokenValue;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceAccountAccessToken
{
  @Qualifier("jaxReactiveRedisTemplateAccountAccessTokenCache")
  private final ReactiveRedisTemplate<String, JaxAccountAccessTokenCache> reactiveRedisTemplate;
  private final JaxAccountAccessTokenProperties tokenProperties;

  private final String buildKey(JaxAccountAccessTokenValue accountAccessTokenValue) {
    return "account-access-token:" + JaxAccountAccessTokenValue.extract(accountAccessTokenValue);
  }

  public Mono<Boolean> save(JaxAccountAccessTokenValue accountAccessTokenValue, JaxAccountAccessTokenCache accountAccessTokenCache) {
    return this.reactiveRedisTemplate.opsForValue().set(
      this.buildKey(accountAccessTokenValue),
      accountAccessTokenCache,
      this.tokenProperties.getDuration()
    );
  }

  public Mono<JaxAccountAccessTokenCache> get(JaxAccountAccessTokenValue accountAccessTokenValue) {
    return this.reactiveRedisTemplate.opsForValue().get(this.buildKey(accountAccessTokenValue));
  }
  
  public Mono<Boolean> delete(JaxAccountAccessTokenValue accountAccessTokenValue) {
    return this.reactiveRedisTemplate.opsForValue().delete(this.buildKey(accountAccessTokenValue));
  }
}
