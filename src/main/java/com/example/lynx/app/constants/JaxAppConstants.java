package com.example.lynx.app.constants;

import java.time.Duration;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxAppConstants
{
  private JaxAppConstants() { throw JaxForbiddenConstructorException.create(JaxAppConstants.class); }

  public static final Duration EMAIL_VERIFICATION_WINDOW_MINUTES = Duration.ofMinutes(10);
}
