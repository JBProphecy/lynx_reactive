package com.example.lynx.app.wrapper.password;

import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxHashedPassword extends JaxAbstractHashedPassword
{
  private JaxHashedPassword(String input) { super(input); }

  public static JaxHashedPassword require(JaxHashedPassword wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxHashedPassword.class);
  }

  public static JaxHashedPassword assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxHashedPassword::new);
  }

  public static JaxHashedPassword assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxHashedPassword::new, required);
  }

  public static String extract(JaxHashedPassword wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxHashedPassword.class);
  }

  public static String extract(JaxHashedPassword wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxHashedPassword.class, required);
  }
}
