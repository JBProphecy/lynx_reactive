package com.example.lynx.core.types.t1;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxBoolean
{
  private JaxBoolean() { throw JaxForbiddenConstructorException.create(JaxBoolean.class); }

  public static Boolean require(Boolean input) {
    return JaxEntity.require(input, Boolean.class);
  }
}
