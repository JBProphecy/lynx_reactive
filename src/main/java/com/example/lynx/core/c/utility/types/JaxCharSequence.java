package com.example.lynx.core.c.utility.types;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxCharSequence
{
  private JaxCharSequence() { throw JaxForbiddenConstructorException.create(JaxCharSequence.class); }

  public static CharSequence require(CharSequence input) {
    return JaxEntity.require(input, CharSequence.class);
  }
}
