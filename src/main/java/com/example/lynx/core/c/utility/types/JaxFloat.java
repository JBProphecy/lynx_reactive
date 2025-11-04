package com.example.lynx.core.c.utility.types;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxFloat
{
  private JaxFloat() { throw JaxForbiddenConstructorException.create(JaxFloat.class); }

  public static Float require(Float input) {
    return JaxEntity.require(input, Float.class);
  }
}
