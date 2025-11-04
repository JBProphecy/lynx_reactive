package com.example.lynx.core.c.utility.types;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxObject
{
  private JaxObject() { throw JaxForbiddenConstructorException.create(JaxObject.class); }

  public static Object require(Object input) {
    return JaxEntity.require(input, Object.class);
  }
}
