package com.example.lynx.core.types.t2;

import java.time.OffsetDateTime;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxOffsetDateTime
{
  private JaxOffsetDateTime() { throw JaxForbiddenConstructorException.create(JaxOffsetDateTime.class); }

  public static OffsetDateTime require(OffsetDateTime input) {
    return JaxEntity.require(input, OffsetDateTime.class);
  }
}
