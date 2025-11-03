package com.example.lynx.core.types.t1;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxInteger
{
  private JaxInteger() { throw JaxForbiddenConstructorException.create(JaxInteger.class); }

  public static Integer require(Integer input) {
    return JaxEntity.require(input, Integer.class);
  }
}
