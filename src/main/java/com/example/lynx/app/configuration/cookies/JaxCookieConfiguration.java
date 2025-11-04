package com.example.lynx.app.configuration.cookies;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.example.lynx.app.configuration.cookies.JaxCookieProperties.AccountRefreshTokenCookieProperties;
import com.example.lynx.app.configuration.cookies.JaxCookieProperties.ProfileRefreshTokenCookieProperties;
import com.example.lynx.app.configuration.cookies.JaxCookieProperties.SessionTokenCookieProperties;

@Configuration
@EnableConfigurationProperties({
  AccountRefreshTokenCookieProperties.class,
  ProfileRefreshTokenCookieProperties.class,
  SessionTokenCookieProperties.class
})
public class JaxCookieConfiguration {} // NOTE: This class must not be declared as final.
