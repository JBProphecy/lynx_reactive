package com.example.lynx.core.a.exception;

public class JaxBasicRuntimeException extends RuntimeException implements JaxBasicExceptionInterface
{
  private static final boolean ENABLE_SUPPRESSION = JaxBasicExceptionConstants.ENABLE_SUPPRESSION;
  private static final boolean WRITABLE_STACK_TRACE = JaxBasicExceptionConstants.WRITABLE_STACK_TRACE;

  public JaxBasicRuntimeException() {
    super(null, null, ENABLE_SUPPRESSION, WRITABLE_STACK_TRACE);
  }

  public JaxBasicRuntimeException(String message) {
    super(message, null, ENABLE_SUPPRESSION, WRITABLE_STACK_TRACE);
  }

  public JaxBasicRuntimeException(String message, Throwable cause) {
    super(message, cause, ENABLE_SUPPRESSION, WRITABLE_STACK_TRACE);
  }

  public JaxBasicRuntimeException(Throwable cause) {
    super(null, cause, ENABLE_SUPPRESSION, WRITABLE_STACK_TRACE);
  }

  protected JaxBasicRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
