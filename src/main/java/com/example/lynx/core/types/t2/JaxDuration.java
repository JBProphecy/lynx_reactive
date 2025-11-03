package com.example.lynx.core.types.t2;

import java.time.Duration;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxDuration
{
  private JaxDuration() { throw JaxForbiddenConstructorException.create(JaxDuration.class); }

  public static Duration require(Duration input) {
    return JaxEntity.require(input, Duration.class);
  }
}
