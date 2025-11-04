package com.example.lynx.app.wrapper.password;

import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxActualPassword extends JaxAbstractActualPassword
{
  private JaxActualPassword(String input) { super(input); }

  public static JaxActualPassword require(JaxActualPassword wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxActualPassword.class);
  }

  public static JaxActualPassword assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualPassword::new);
  }

  public static JaxActualPassword assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualPassword::new, required);
  }

  public static String extract(JaxActualPassword wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxActualPassword.class);
  }

  public static String extract(JaxActualPassword wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxActualPassword.class, required);
  }
}
