package com.example.lynx.core.c1.utilities.u0.types.t1;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxCharSequence
{
  private JaxCharSequence() { throw JaxForbiddenConstructorException.create(JaxCharSequence.class); }

  public static CharSequence require(CharSequence input) {
    return JaxEntity.require(input, CharSequence.class);
  }
}
