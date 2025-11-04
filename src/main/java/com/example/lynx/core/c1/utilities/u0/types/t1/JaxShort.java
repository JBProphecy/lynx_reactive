package com.example.lynx.core.c1.utilities.u0.types.t1;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxShort
{
  private JaxShort() { throw JaxForbiddenConstructorException.create(JaxShort.class); }

  public static Short require(Short input) {
    return JaxEntity.require(input, Short.class);
  }
}
