package com.example.lynx.core.c.utility.types;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxDouble
{
  private JaxDouble() { throw JaxForbiddenConstructorException.create(JaxDouble.class); }

  public static Double require(Double input) {
    return JaxEntity.require(input, Double.class);
  }
}
