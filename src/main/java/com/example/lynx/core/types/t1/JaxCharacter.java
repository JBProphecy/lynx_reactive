package com.example.lynx.core.types.t1;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxCharacter
{
  private JaxCharacter() { throw JaxForbiddenConstructorException.create(JaxCharacter.class); }

  public static Character require(Character input) {
    return JaxEntity.require(input, Character.class);
  }
}
