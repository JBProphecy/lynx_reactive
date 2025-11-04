package com.example.lynx.core.c1.utilities.u0.types.t1;

import java.util.regex.Pattern;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxPattern
{
  private JaxPattern() { throw JaxForbiddenConstructorException.create(JaxPattern.class); }

  public static Pattern require(Pattern input) {
    return JaxEntity.require(input, Pattern.class);
  }
}
