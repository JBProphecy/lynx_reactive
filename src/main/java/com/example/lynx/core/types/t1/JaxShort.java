package com.example.lynx.core.types.t1;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxShort
{
  private JaxShort() { throw JaxForbiddenConstructorException.create(JaxShort.class); }

  public static Short require(Short input) {
    return JaxEntity.require(input, Short.class);
  }
}
