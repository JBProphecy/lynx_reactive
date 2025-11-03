package com.example.lynx.core.types.t1;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxLong
{
  private JaxLong() { throw JaxForbiddenConstructorException.create(JaxLong.class); }

  public static Long require(Long input) {
    return JaxEntity.require(input, Long.class);
  }
}
