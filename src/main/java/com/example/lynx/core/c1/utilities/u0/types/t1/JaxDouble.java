package com.example.lynx.core.c1.utilities.u0.types.t1;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxDouble
{
  private JaxDouble() { throw JaxForbiddenConstructorException.create(JaxDouble.class); }

  public static Double require(Double input) {
    return JaxEntity.require(input, Double.class);
  }
}
