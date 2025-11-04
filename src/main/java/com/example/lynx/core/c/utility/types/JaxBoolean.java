package com.example.lynx.core.c.utility.types;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxBoolean
{
  private JaxBoolean() { throw JaxForbiddenConstructorException.create(JaxBoolean.class); }

  public static Boolean require(Boolean input) {
    return JaxEntity.require(input, Boolean.class);
  }
}
