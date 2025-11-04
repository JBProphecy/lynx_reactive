package com.example.lynx.core.c1.utilities.u0.types.t1;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxBoolean
{
  private JaxBoolean() { throw JaxForbiddenConstructorException.create(JaxBoolean.class); }

  public static Boolean require(Boolean input) {
    return JaxEntity.require(input, Boolean.class);
  }
}
