package com.example.lynx.core.c1.utilities.u0.types.t1;

import java.time.OffsetDateTime;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxOffsetDateTime
{
  private JaxOffsetDateTime() { throw JaxForbiddenConstructorException.create(JaxOffsetDateTime.class); }

  public static OffsetDateTime require(OffsetDateTime input) {
    return JaxEntity.require(input, OffsetDateTime.class);
  }
}
