package com.example.lynx.app.api.modules.register_account_step_b;

import com.example.lynx.core.c.utility.types.JaxString;
import com.example.lynx.core.d.utilities.JaxToStringUtility;

public final class JaxRequestBodyRegisterAccountStepB
{
  private final String token;
  private final String code;

  public JaxRequestBodyRegisterAccountStepB(String token, String code) {
    this.token = token;
    this.code = code;
  }

  public String getToken() { return this.token; }
  public String getCode() { return this.code; }

  @Override
  public String toString() {
    final String token = JaxToStringUtility.buildAttribute("token", JaxString.REDACTED);
    final String code = JaxToStringUtility.buildAttribute("code", JaxString.REDACTED);
    return JaxToStringUtility.buildClassString(this.getClass(), token, code);
  }
}
