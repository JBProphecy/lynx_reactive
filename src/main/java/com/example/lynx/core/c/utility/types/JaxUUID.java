package com.example.lynx.core.c.utility.types;

import java.util.UUID;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxUUID
{
  private JaxUUID() { throw JaxForbiddenConstructorException.create(JaxUUID.class); }

  public static UUID require(UUID input) {
    return JaxEntity.require(input, UUID.class);
  }

  public static UUID generate() {
    return UUID.randomUUID();
  }
}
