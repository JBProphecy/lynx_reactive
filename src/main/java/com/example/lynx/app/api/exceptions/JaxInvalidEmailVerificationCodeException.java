package com.example.lynx.app.api.exceptions;

import com.example.lynx.core.a.exception.JaxBasicRuntimeException;

public final class JaxInvalidEmailVerificationCodeException extends JaxBasicRuntimeException
{
  private JaxInvalidEmailVerificationCodeException(String message) {
    super(message);
  }

  public static JaxInvalidEmailVerificationCodeException generate() {
    return new JaxInvalidEmailVerificationCodeException("Your email verification code is invalid.");
  }
}
