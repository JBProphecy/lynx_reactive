package com.example.lynx.core.types.t1;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxByte
{
  private JaxByte() { throw JaxForbiddenConstructorException.create(JaxByte.class); }

  public static Byte require(Byte input) {
    return JaxEntity.require(input, Byte.class);
  }
}
