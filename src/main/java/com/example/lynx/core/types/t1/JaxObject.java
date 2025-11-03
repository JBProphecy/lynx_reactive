package com.example.lynx.core.types.t1;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxObject
{
  private JaxObject() { throw JaxForbiddenConstructorException.create(JaxObject.class); }

  public static Object require(Object input) {
    return JaxEntity.require(input, Object.class);
  }
}
