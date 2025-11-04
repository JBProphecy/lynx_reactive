package com.example.lynx.core.c.utility.types;

import java.util.regex.Pattern;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxPattern
{
  private JaxPattern() { throw JaxForbiddenConstructorException.create(JaxPattern.class); }

  public static Pattern require(Pattern input) {
    return JaxEntity.require(input, Pattern.class);
  }
}
