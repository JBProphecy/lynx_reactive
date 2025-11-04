package com.example.lynx.app.api.constants;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxApiConstants
{
  private JaxApiConstants() { throw JaxForbiddenConstructorException.create(JaxApiConstants.class); }

  public static final int VERSION = 1;
}
