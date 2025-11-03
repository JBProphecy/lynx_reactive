package com.example.lynx.core.types.t2;

import java.util.regex.Pattern;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxPattern
{
  private JaxPattern() { throw JaxForbiddenConstructorException.create(JaxPattern.class); }

  public static Pattern require(Pattern input) {
    return JaxEntity.require(input, Pattern.class);
  }
}
