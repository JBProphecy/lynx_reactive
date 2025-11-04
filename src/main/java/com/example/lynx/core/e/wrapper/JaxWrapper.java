package com.example.lynx.core.e.wrapper;

import java.util.Objects;

import com.example.lynx.core.c.utility.types.JaxString;
import com.example.lynx.core.d.utilities.JaxToStringUtility;
import com.fasterxml.jackson.annotation.JsonValue;

public abstract class JaxWrapper<T>
{
  private final T value;

  protected JaxWrapper(T value) {
    this.value = value;
  }

  @JsonValue
  public T extract() {
    return this.value;
  }

  public String secureValueString() {
    return JaxString.REDACTED;
  }

  @Override
  public final String toString() {
    return JaxToStringUtility.buildClassString(this.getClass(), this.secureValueString());
  }

  @Override
  public final boolean equals(Object object) {
    if (this == object) { return true; }
    if (object == null || this.getClass() != object.getClass()) { return false; }
    JaxWrapper<?> that = (JaxWrapper<?>) object;
    return Objects.equals(this.value, that.value);
  }

  @Override
  public final int hashCode() { return this.value.hashCode(); }
}
