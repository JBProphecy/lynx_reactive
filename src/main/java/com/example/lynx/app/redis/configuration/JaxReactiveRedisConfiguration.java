package com.example.lynx.app.redis.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.example.lynx.app.redis.models.JaxAccountAccessTokenCache;
import com.example.lynx.app.redis.models.JaxProfileAccessTokenCache;
import com.example.lynx.app.redis.models.JaxTemporaryAccountCache;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

@Configuration
public class JaxReactiveRedisConfiguration
{
  private final ObjectMapper redisObjectMapper;

  public JaxReactiveRedisConfiguration() {
    this.redisObjectMapper = JsonMapper.builder()
      .addModule(new JavaTimeModule())
      .addModule(new ParameterNamesModule())
      .enable(SerializationFeature.INDENT_OUTPUT)
      .build();
  }

  private <T> ReactiveRedisTemplate<String, T> createReactiveRedisTemplate(ReactiveRedisConnectionFactory connectionFactory, Class<T> clazz) {
    final StringRedisSerializer keySerializer = new StringRedisSerializer();
    final Jackson2JsonRedisSerializer<T> valueSerializer = new Jackson2JsonRedisSerializer<>(this.redisObjectMapper, clazz);
    final RedisSerializationContext<String, T> serializationContext = RedisSerializationContext.<String, T>newSerializationContext(keySerializer)
    .value(valueSerializer)
    .hashKey(keySerializer)
    .hashValue(valueSerializer)
    .build();
    return new ReactiveRedisTemplate<>(connectionFactory, serializationContext);
  }

  @Bean
  public ReactiveRedisTemplate<String, JaxTemporaryAccountCache> jaxReactiveRedisTemplateTemporaryAccountCache(ReactiveRedisConnectionFactory factory) {
    return createReactiveRedisTemplate(factory, JaxTemporaryAccountCache.class);
  }

  @Bean
  public ReactiveRedisTemplate<String, JaxAccountAccessTokenCache> jaxReactiveRedisTemplateAccountAccessTokenCache(ReactiveRedisConnectionFactory factory) {
    return createReactiveRedisTemplate(factory, JaxAccountAccessTokenCache.class);
  }

  @Bean
  public ReactiveRedisTemplate<String, JaxProfileAccessTokenCache> jaxReactiveRedisTemplateProfileAccessTokenCache(ReactiveRedisConnectionFactory factory) {
    return createReactiveRedisTemplate(factory, JaxProfileAccessTokenCache.class);
  }
}
