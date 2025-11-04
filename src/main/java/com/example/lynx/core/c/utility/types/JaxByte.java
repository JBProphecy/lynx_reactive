package com.example.lynx.core.c.utility.types;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxByte
{
  private JaxByte() { throw JaxForbiddenConstructorException.create(JaxByte.class); }

  public static Byte require(Byte input) {
    return JaxEntity.require(input, Byte.class);
  }
}
