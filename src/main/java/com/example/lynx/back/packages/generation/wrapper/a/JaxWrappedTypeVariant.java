package com.example.lynx.back.packages.generation.wrapper.a;

public enum JaxWrappedTypeVariant
{
  STRING("String"),
  UUID("UUID");

  private final String className;

  JaxWrappedTypeVariant(String className) {
    this.className = className;
  }

  public String getClassName() { return this.className; }
}
