package com.example.lynx.core.c2.cookie;

import com.example.lynx.core.c1.utilities.u0.types.t1.JaxString;
import com.example.lynx.core.c1.utilities.u1.JaxToStringUtility;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum JaxSameSitePolicy
{
  LAX("Lax"),
  NONE("None"),
  STRICT("Strict");

  private final String formattedString;
  private final String normalizedString;

  JaxSameSitePolicy(String formattedString) {
    this.formattedString = JaxString.require(formattedString);
    this.normalizedString = JaxString.normalize(formattedString);
  }

  @JsonValue
  public String getFormattedString() { return this.formattedString; }
  public String getNormalizedString() { return this.normalizedString; }

  @Override
  public String toString() { return JaxToStringUtility.buildEnumString(this); }
}
