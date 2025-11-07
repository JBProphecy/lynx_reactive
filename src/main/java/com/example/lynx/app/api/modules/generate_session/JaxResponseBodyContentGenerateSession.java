package com.example.lynx.app.api.modules.generate_session;

import com.example.lynx.app.wrapper.opaque.token.value.JaxActualSessionTokenValue;
import com.example.lynx.core.c.utility.types.JaxString;
import com.example.lynx.core.d.utilities.JaxToStringUtility;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class JaxResponseBodyContentGenerateSession
{
  @JsonProperty("sessionToken")
  private final JaxActualSessionTokenValue actualSessionTokenValue;

  public JaxResponseBodyContentGenerateSession(JaxActualSessionTokenValue actualSessionTokenValue) {
    this.actualSessionTokenValue = actualSessionTokenValue;
  }

  public JaxActualSessionTokenValue getActualSessionTokenValue() { return this.actualSessionTokenValue; }

  @Override
  public String toString() {
    final String actualSessionTokenValue = JaxToStringUtility.buildAttribute("actualSessionTokenValue", JaxString.REDACTED);
    return JaxToStringUtility.buildClassString(this.getClass(), actualSessionTokenValue);
  }
}
