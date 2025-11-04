package com.example.lynx.core.c1.utilities.u0.types.t1;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxFloat
{
  private JaxFloat() { throw JaxForbiddenConstructorException.create(JaxFloat.class); }

  public static Float require(Float input) {
    return JaxEntity.require(input, Float.class);
  }
}
