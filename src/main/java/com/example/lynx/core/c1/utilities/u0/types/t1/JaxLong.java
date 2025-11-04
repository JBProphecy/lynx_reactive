package com.example.lynx.core.c1.utilities.u0.types.t1;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxLong
{
  private JaxLong() { throw JaxForbiddenConstructorException.create(JaxLong.class); }

  public static Long require(Long input) {
    return JaxEntity.require(input, Long.class);
  }
}
