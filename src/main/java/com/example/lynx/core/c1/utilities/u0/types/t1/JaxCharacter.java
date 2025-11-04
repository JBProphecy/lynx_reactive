package com.example.lynx.core.c1.utilities.u0.types.t1;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxCharacter
{
  private JaxCharacter() { throw JaxForbiddenConstructorException.create(JaxCharacter.class); }

  public static Character require(Character input) {
    return JaxEntity.require(input, Character.class);
  }
}
