package com.example.lynx.back.packages.generation.wrapper.output;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxHashedProfileRefreshTokenValue extends JaxWrapper<String>
{
  private JaxHashedProfileRefreshTokenValue(String input) { super(input); }

  public static JaxHashedProfileRefreshTokenValue require(JaxHashedProfileRefreshTokenValue wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxHashedProfileRefreshTokenValue.class);
  }

  public static JaxHashedProfileRefreshTokenValue assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxHashedProfileRefreshTokenValue::new);
  }

  public static JaxHashedProfileRefreshTokenValue assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxHashedProfileRefreshTokenValue::new, required);
  }

  public static String extract(JaxHashedProfileRefreshTokenValue wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxHashedProfileRefreshTokenValue.class);
  }

  public static String extract(JaxHashedProfileRefreshTokenValue wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxHashedProfileRefreshTokenValue.class, required);
  }
}
