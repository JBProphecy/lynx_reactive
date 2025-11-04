package com.example.lynx.core.c1.utilities.u0.types.t1;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxByte
{
  private JaxByte() { throw JaxForbiddenConstructorException.create(JaxByte.class); }

  public static Byte require(Byte input) {
    return JaxEntity.require(input, Byte.class);
  }
}
