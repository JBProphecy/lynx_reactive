package com.example.lynx.core.c1.utilities.u0.types.t1;

import java.util.UUID;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;

public final class JaxUUID
{
  private JaxUUID() { throw JaxForbiddenConstructorException.create(JaxUUID.class); }

  public static UUID require(UUID input) {
    return JaxEntity.require(input, UUID.class);
  }
}
