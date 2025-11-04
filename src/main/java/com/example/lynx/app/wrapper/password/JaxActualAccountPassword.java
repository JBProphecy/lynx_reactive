package com.example.lynx.app.wrapper.password;

import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxActualAccountPassword extends JaxAbstractActualPassword
{
  private JaxActualAccountPassword(String input) { super(input); }

  public static JaxActualAccountPassword require(JaxActualAccountPassword wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxActualAccountPassword.class);
  }

  public static JaxActualAccountPassword assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualAccountPassword::new);
  }

  public static JaxActualAccountPassword assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualAccountPassword::new, required);
  }

  public static String extract(JaxActualAccountPassword wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxActualAccountPassword.class);
  }

  public static String extract(JaxActualAccountPassword wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxActualAccountPassword.class, required);
  }
}
