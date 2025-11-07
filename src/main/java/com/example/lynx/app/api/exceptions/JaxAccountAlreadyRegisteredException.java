package com.example.lynx.app.api.exceptions;

import com.example.lynx.core.a.exception.JaxBasicRuntimeException;

public final class JaxAccountAlreadyRegisteredException extends JaxBasicRuntimeException
{
  private JaxAccountAlreadyRegisteredException(String message) {
    super(message);
  }

  public static JaxAccountAlreadyRegisteredException generate() {
    return new JaxAccountAlreadyRegisteredException("Your account is already registered.");
  }
}
