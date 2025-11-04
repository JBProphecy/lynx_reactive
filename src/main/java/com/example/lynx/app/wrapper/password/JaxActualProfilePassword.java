package com.example.lynx.app.wrapper.password;

import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxActualProfilePassword extends JaxAbstractActualPassword
{
  private JaxActualProfilePassword(String input) { super(input); }

  public static JaxActualProfilePassword require(JaxActualProfilePassword wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxActualProfilePassword.class);
  }

  public static JaxActualProfilePassword assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualProfilePassword::new);
  }

  public static JaxActualProfilePassword assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualProfilePassword::new, required);
  }

  public static String extract(JaxActualProfilePassword wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxActualProfilePassword.class);
  }

  public static String extract(JaxActualProfilePassword wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxActualProfilePassword.class, required);
  }
}
