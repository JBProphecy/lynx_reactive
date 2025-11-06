package com.example.lynx.app.redis.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.stereotype.Service;

import com.example.lynx.app.configuration.tokens.JaxTokenProperties.JaxProfileAccessTokenProperties;
import com.example.lynx.app.redis.models.JaxProfileAccessTokenCache;
import com.example.lynx.app.wrapper.opaque.token.value.JaxProfileAccessTokenValue;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public final class JaxServiceProfileAccessToken
{
  @Qualifier("jaxReactiveRedisTemplateProfileAccessTokenCache")
  private final ReactiveRedisTemplate<String, JaxProfileAccessTokenCache> reactiveRedisTemplate;
  private final JaxProfileAccessTokenProperties tokenProperties;

  private final String buildKey(JaxProfileAccessTokenValue profileAccessTokenValue) {
    return "profile-access-token:" + JaxProfileAccessTokenValue.extract(profileAccessTokenValue);
  }

  public Mono<Boolean> save(JaxProfileAccessTokenValue profileAccessTokenValue, JaxProfileAccessTokenCache profileAccessTokenCache) {
    return this.reactiveRedisTemplate.opsForValue().set(
      this.buildKey(profileAccessTokenValue),
      profileAccessTokenCache,
      this.tokenProperties.getDuration()
    );
  }

  public Mono<JaxProfileAccessTokenCache> get(JaxProfileAccessTokenValue profileAccessTokenValue) {
    return this.reactiveRedisTemplate.opsForValue().get(this.buildKey(profileAccessTokenValue));
  }
  
  public Mono<Boolean> delete(JaxProfileAccessTokenValue profileAccessTokenValue) {
    return this.reactiveRedisTemplate.opsForValue().delete(this.buildKey(profileAccessTokenValue));
  }
}
