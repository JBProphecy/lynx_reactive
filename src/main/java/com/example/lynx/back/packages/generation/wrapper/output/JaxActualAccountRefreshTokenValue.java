package com.example.lynx.back.packages.generation.wrapper.output;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxActualAccountRefreshTokenValue extends JaxWrapper<String>
{
  private JaxActualAccountRefreshTokenValue(String input) { super(input); }

  public static JaxActualAccountRefreshTokenValue require(JaxActualAccountRefreshTokenValue wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxActualAccountRefreshTokenValue.class);
  }

  public static JaxActualAccountRefreshTokenValue assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualAccountRefreshTokenValue::new);
  }

  public static JaxActualAccountRefreshTokenValue assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualAccountRefreshTokenValue::new, required);
  }

  public static String extract(JaxActualAccountRefreshTokenValue wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxActualAccountRefreshTokenValue.class);
  }

  public static String extract(JaxActualAccountRefreshTokenValue wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxActualAccountRefreshTokenValue.class, required);
  }
}
