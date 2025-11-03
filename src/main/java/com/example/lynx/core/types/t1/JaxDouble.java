package com.example.lynx.core.types.t1;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxDouble
{
  private JaxDouble() { throw JaxForbiddenConstructorException.create(JaxDouble.class); }

  public static Double require(Double input) {
    return JaxEntity.require(input, Double.class);
  }
}
