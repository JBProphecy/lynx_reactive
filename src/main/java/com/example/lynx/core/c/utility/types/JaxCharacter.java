package com.example.lynx.core.c.utility.types;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxCharacter
{
  private JaxCharacter() { throw JaxForbiddenConstructorException.create(JaxCharacter.class); }

  public static Character require(Character input) {
    return JaxEntity.require(input, Character.class);
  }
}
