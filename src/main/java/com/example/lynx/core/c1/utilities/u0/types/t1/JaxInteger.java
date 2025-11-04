package com.example.lynx.core.c1.utilities.u0.types.t1;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxInteger
{
  private JaxInteger() { throw JaxForbiddenConstructorException.create(JaxInteger.class); }

  public static Integer require(Integer input) {
    return JaxEntity.require(input, Integer.class);
  }
}
