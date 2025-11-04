package com.example.lynx.core.c3.configuration.c1;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.example.lynx.core.c3.configuration.c0.JaxCookieProperties.AccountRefreshTokenCookieProperties;
import com.example.lynx.core.c3.configuration.c0.JaxCookieProperties.ProfileRefreshTokenCookieProperties;
import com.example.lynx.core.c3.configuration.c0.JaxCookieProperties.SessionTokenCookieProperties;

@Configuration
@EnableConfigurationProperties({
  AccountRefreshTokenCookieProperties.class,
  ProfileRefreshTokenCookieProperties.class,
  SessionTokenCookieProperties.class
})
public class JaxCookieConfiguration {} // NOTE: This class must not be declared as final.
