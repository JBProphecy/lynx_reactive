package com.example.lynx.core.types.t2;

import java.util.UUID;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;

public final class JaxUUID
{
  private JaxUUID() { throw JaxForbiddenConstructorException.create(JaxUUID.class); }

  public static UUID require(UUID input) {
    return JaxEntity.require(input, UUID.class);
  }
}
