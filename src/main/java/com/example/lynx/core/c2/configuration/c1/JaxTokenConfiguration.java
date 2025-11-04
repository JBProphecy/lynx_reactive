package com.example.lynx.core.c2.configuration.c1;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.example.lynx.core.c2.configuration.c0.JaxTokenProperties.JaxAccountAccessTokenProperties;
import com.example.lynx.core.c2.configuration.c0.JaxTokenProperties.JaxAccountRefreshTokenProperties;
import com.example.lynx.core.c2.configuration.c0.JaxTokenProperties.JaxProfileAccessTokenProperties;
import com.example.lynx.core.c2.configuration.c0.JaxTokenProperties.JaxProfileRefreshTokenProperties;
import com.example.lynx.core.c2.configuration.c0.JaxTokenProperties.JaxSessionTokenProperties;

@Configuration
@EnableConfigurationProperties({
  JaxAccountAccessTokenProperties.class,
  JaxAccountRefreshTokenProperties.class,
  JaxProfileAccessTokenProperties.class,
  JaxProfileRefreshTokenProperties.class,
  JaxSessionTokenProperties.class
})
public class JaxTokenConfiguration {} // NOTE: This class must not be declared as final.
