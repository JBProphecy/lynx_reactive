package com.example.lynx.app.wrapper.password;

import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxHashedAccountPassword extends JaxAbstractHashedPassword
{
  private JaxHashedAccountPassword(String input) { super(input); }

  public static JaxHashedAccountPassword require(JaxHashedAccountPassword wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxHashedAccountPassword.class);
  }

  public static JaxHashedAccountPassword assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxHashedAccountPassword::new);
  }

  public static JaxHashedAccountPassword assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxHashedAccountPassword::new, required);
  }

  public static String extract(JaxHashedAccountPassword wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxHashedAccountPassword.class);
  }

  public static String extract(JaxHashedAccountPassword wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxHashedAccountPassword.class, required);
  }
}
