package com.example.lynx.app.api.modules.register_account_step_b;

import com.example.lynx.core.d.utilities.JaxToStringUtility;

public final class JaxResponseBodyContentRegisterAccountStepB
{
  private final String message;

  public JaxResponseBodyContentRegisterAccountStepB(String message) {
    this.message = message;
  }

  public String getMessage() { return this.message; }

  @Override
  public String toString() {
    final String message = JaxToStringUtility.buildAttribute("message", this.message);
    return JaxToStringUtility.buildClassString(this.getClass(), message);
  }
}
