package com.example.lynx.core.c.utility.types;

import java.time.OffsetDateTime;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxOffsetDateTime
{
  private JaxOffsetDateTime() { throw JaxForbiddenConstructorException.create(JaxOffsetDateTime.class); }

  public static OffsetDateTime require(OffsetDateTime input) {
    return JaxEntity.require(input, OffsetDateTime.class);
  }
}
