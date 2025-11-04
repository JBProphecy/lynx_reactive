package com.example.lynx.core.c0.exception.e0;

public class JaxBasicCheckedException extends Exception implements JaxBasicExceptionInterface
{
  private static final boolean ENABLE_SUPPRESSION = JaxBasicExceptionConstants.ENABLE_SUPPRESSION;
  private static final boolean WRITABLE_STACK_TRACE = JaxBasicExceptionConstants.WRITABLE_STACK_TRACE;

  public JaxBasicCheckedException() {
    super(null, null, ENABLE_SUPPRESSION, WRITABLE_STACK_TRACE);
  }

  public JaxBasicCheckedException(String message) {
    super(message, null, ENABLE_SUPPRESSION, WRITABLE_STACK_TRACE);
  }

  public JaxBasicCheckedException(String message, Throwable cause) {
    super(message, cause, ENABLE_SUPPRESSION, WRITABLE_STACK_TRACE);
  }

  public JaxBasicCheckedException(Throwable cause) {
    super(null, cause, ENABLE_SUPPRESSION, WRITABLE_STACK_TRACE);
  }

  protected JaxBasicCheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
