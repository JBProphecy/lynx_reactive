package com.example.lynx.core.c.utility.types;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxInteger
{
  private JaxInteger() { throw JaxForbiddenConstructorException.create(JaxInteger.class); }

  public static Integer require(Integer input) {
    return JaxEntity.require(input, Integer.class);
  }
}
