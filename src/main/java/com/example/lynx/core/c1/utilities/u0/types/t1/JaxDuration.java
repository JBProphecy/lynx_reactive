package com.example.lynx.core.c1.utilities.u0.types.t1;

import java.time.Duration;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxDuration
{
  private JaxDuration() { throw JaxForbiddenConstructorException.create(JaxDuration.class); }

  public static Duration require(Duration input) {
    return JaxEntity.require(input, Duration.class);
  }
}
