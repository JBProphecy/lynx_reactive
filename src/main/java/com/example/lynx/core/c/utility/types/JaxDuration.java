package com.example.lynx.core.c.utility.types;

import java.time.Duration;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxDuration
{
  private JaxDuration() { throw JaxForbiddenConstructorException.create(JaxDuration.class); }

  public static Duration require(Duration input) {
    return JaxEntity.require(input, Duration.class);
  }
}
