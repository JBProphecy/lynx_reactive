package com.example.lynx.core.c0.exception.e0;

import java.io.PrintStream;
import java.io.PrintWriter;

public interface JaxBasicExceptionInterface
{
  public String getMessage();
  public String getLocalizedMessage();
  public Throwable getCause();
  public Throwable initCause(Throwable cause);
  public String toString();
  public void printStackTrace();
  public void printStackTrace(PrintStream printStream);
  public void printStackTrace(PrintWriter printWriter);
  public Throwable fillInStackTrace();
  public StackTraceElement[] getStackTrace();
  public void setStackTrace(StackTraceElement[] stackTrace);
  public void addSuppressed(Throwable exception);
  public Throwable[] getSuppressed();
}
