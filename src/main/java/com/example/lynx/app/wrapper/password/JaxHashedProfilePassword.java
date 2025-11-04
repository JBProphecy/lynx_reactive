package com.example.lynx.app.wrapper.password;

import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxHashedProfilePassword extends JaxAbstractHashedPassword
{
  private JaxHashedProfilePassword(String input) { super(input); }

  public static JaxHashedProfilePassword require(JaxHashedProfilePassword wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxHashedProfilePassword.class);
  }

  public static JaxHashedProfilePassword assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxHashedProfilePassword::new);
  }

  public static JaxHashedProfilePassword assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxHashedProfilePassword::new, required);
  }

  public static String extract(JaxHashedProfilePassword wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxHashedProfilePassword.class);
  }

  public static String extract(JaxHashedProfilePassword wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxHashedProfilePassword.class, required);
  }
}
