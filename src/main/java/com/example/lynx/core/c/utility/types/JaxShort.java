package com.example.lynx.core.c.utility.types;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxShort
{
  private JaxShort() { throw JaxForbiddenConstructorException.create(JaxShort.class); }

  public static Short require(Short input) {
    return JaxEntity.require(input, Short.class);
  }
}
