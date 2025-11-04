package com.example.lynx.core.c.utility.types;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxLong
{
  private JaxLong() { throw JaxForbiddenConstructorException.create(JaxLong.class); }

  public static Long require(Long input) {
    return JaxEntity.require(input, Long.class);
  }
}
