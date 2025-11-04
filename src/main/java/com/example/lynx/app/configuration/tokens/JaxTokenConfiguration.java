package com.example.lynx.app.configuration.tokens;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.example.lynx.app.configuration.tokens.JaxTokenProperties.JaxAccountAccessTokenProperties;
import com.example.lynx.app.configuration.tokens.JaxTokenProperties.JaxAccountRefreshTokenProperties;
import com.example.lynx.app.configuration.tokens.JaxTokenProperties.JaxProfileAccessTokenProperties;
import com.example.lynx.app.configuration.tokens.JaxTokenProperties.JaxProfileRefreshTokenProperties;
import com.example.lynx.app.configuration.tokens.JaxTokenProperties.JaxSessionTokenProperties;

@Configuration
@EnableConfigurationProperties({
  JaxAccountAccessTokenProperties.class,
  JaxAccountRefreshTokenProperties.class,
  JaxProfileAccessTokenProperties.class,
  JaxProfileRefreshTokenProperties.class,
  JaxSessionTokenProperties.class
})
public class JaxTokenConfiguration {} // NOTE: This class must not be declared as final.
