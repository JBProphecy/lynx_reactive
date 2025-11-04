package com.example.lynx.core.c1.utilities.u0.types.t1;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxObject
{
  private JaxObject() { throw JaxForbiddenConstructorException.create(JaxObject.class); }

  public static Object require(Object input) {
    return JaxEntity.require(input, Object.class);
  }
}
