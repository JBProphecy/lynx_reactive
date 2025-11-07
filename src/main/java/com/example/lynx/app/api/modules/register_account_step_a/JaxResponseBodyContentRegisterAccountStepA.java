package com.example.lynx.app.api.modules.register_account_step_a;

import com.example.lynx.app.wrapper.opaque.token.value.JaxEmailVerificationToken;
import com.example.lynx.core.c.utility.types.JaxString;
import com.example.lynx.core.d.utilities.JaxToStringUtility;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class JaxResponseBodyContentRegisterAccountStepA
{
  @JsonProperty("token")
  private final JaxEmailVerificationToken emailVerificationToken;

  public JaxResponseBodyContentRegisterAccountStepA(JaxEmailVerificationToken emailVerificationToken) {
    this.emailVerificationToken = emailVerificationToken;
  }

  public JaxEmailVerificationToken getEmailVerificationToken() { return this.emailVerificationToken; }

  @Override
  public String toString() {
    final String emailVerificationToken = JaxToStringUtility.buildAttribute("emailVerificationToken", JaxString.REDACTED);
    return JaxToStringUtility.buildClassString(this.getClass(), emailVerificationToken);
  }
}
