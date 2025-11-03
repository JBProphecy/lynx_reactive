package com.example.lynx.core.types.t1;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxCharSequence
{
  private JaxCharSequence() { throw JaxForbiddenConstructorException.create(JaxCharSequence.class); }

  public static CharSequence require(CharSequence input) {
    return JaxEntity.require(input, CharSequence.class);
  }
}
