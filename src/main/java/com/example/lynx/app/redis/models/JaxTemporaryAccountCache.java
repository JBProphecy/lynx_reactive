package com.example.lynx.app.redis.models;

import com.example.lynx.app.wrapper.password.JaxHashedAccountPassword;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountEmail;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountName;
import com.example.lynx.back.packages.generation.wrapper.output.JaxEmailVerificationCode;
import com.example.lynx.core.c.utility.types.JaxEntity;
import com.example.lynx.core.c.utility.types.JaxString;
import com.example.lynx.core.d.utilities.JaxToStringUtility;

public final class JaxTemporaryAccountCache
{
  private final JaxEmailVerificationCode code;
  private final JaxAccountName name;
  private final JaxAccountEmail email;
  private final JaxHashedAccountPassword password;

  public JaxTemporaryAccountCache(
    JaxEmailVerificationCode code,
    JaxAccountName name,
    JaxAccountEmail email,
    JaxHashedAccountPassword password
  ) {
    this.code = JaxEmailVerificationCode.require(code);
    this.name = JaxAccountName.require(name);
    this.email = JaxAccountEmail.require(email);
    this.password = JaxHashedAccountPassword.require(password);
  }

  public JaxEmailVerificationCode getCode() { return this.code; }
  public JaxAccountName getName() { return this.name; }
  public JaxAccountEmail getEmail() { return this.email; }
  public JaxHashedAccountPassword getPassword() { return this.password; }

  @Override
  public String toString() {
    final String code = JaxToStringUtility.buildAttribute("code", JaxString.REDACTED);
    final String name = JaxToStringUtility.buildAttribute("name", this.name);
    final String email = JaxToStringUtility.buildAttribute("email", JaxString.REDACTED);
    final String password = JaxToStringUtility.buildAttribute("password", JaxString.REDACTED);
    return JaxToStringUtility.buildClassString(this.getClass(), code, name, email, password);
  }

  public static JaxTemporaryAccountCache require(JaxTemporaryAccountCache temporary) {
    return JaxEntity.require(temporary, JaxTemporaryAccountCache.class);
  }
}
