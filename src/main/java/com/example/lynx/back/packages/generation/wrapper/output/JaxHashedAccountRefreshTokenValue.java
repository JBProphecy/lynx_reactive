package com.example.lynx.back.packages.generation.wrapper.output;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxHashedAccountRefreshTokenValue extends JaxWrapper<String>
{
  private JaxHashedAccountRefreshTokenValue(String input) { super(input); }

  public static JaxHashedAccountRefreshTokenValue require(JaxHashedAccountRefreshTokenValue wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxHashedAccountRefreshTokenValue.class);
  }

  public static JaxHashedAccountRefreshTokenValue assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxHashedAccountRefreshTokenValue::new);
  }

  public static JaxHashedAccountRefreshTokenValue assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxHashedAccountRefreshTokenValue::new, required);
  }

  public static String extract(JaxHashedAccountRefreshTokenValue wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxHashedAccountRefreshTokenValue.class);
  }

  public static String extract(JaxHashedAccountRefreshTokenValue wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxHashedAccountRefreshTokenValue.class, required);
  }
}
