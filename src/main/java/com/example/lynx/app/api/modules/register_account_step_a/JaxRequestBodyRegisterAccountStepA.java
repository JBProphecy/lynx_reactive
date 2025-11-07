package com.example.lynx.app.api.modules.register_account_step_a;

import com.example.lynx.core.c.utility.types.JaxString;
import com.example.lynx.core.d.utilities.JaxToStringUtility;

public final class JaxRequestBodyRegisterAccountStepA
{
  private final String name;
  private final String email;
  private final String password;

  public JaxRequestBodyRegisterAccountStepA(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
  }

  public String getName() { return this.name; }
  public String getEmail() { return this.email; }
  public String getPassword() { return this.password; }

  @Override
  public String toString() {
    final String name = JaxToStringUtility.buildAttribute("name", this.name);
    final String email = JaxToStringUtility.buildAttribute("email", JaxString.REDACTED);
    final String password = JaxToStringUtility.buildAttribute("password", JaxString.REDACTED);
    return JaxToStringUtility.buildClassString(this.getClass(), name, email, password);
  }
}
