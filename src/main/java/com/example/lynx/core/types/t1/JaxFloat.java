package com.example.lynx.core.types.t1;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxFloat
{
  private JaxFloat() { throw JaxForbiddenConstructorException.create(JaxFloat.class); }

  public static Float require(Float input) {
    return JaxEntity.require(input, Float.class);
  }
}
