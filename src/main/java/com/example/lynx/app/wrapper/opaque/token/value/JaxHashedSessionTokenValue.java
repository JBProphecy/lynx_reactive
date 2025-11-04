package com.example.lynx.app.wrapper.opaque.token.value;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxHashedSessionTokenValue extends JaxWrapper<String>
{
  private JaxHashedSessionTokenValue(String input) { super(input); }

  public static JaxHashedSessionTokenValue require(JaxHashedSessionTokenValue wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxHashedSessionTokenValue.class);
  }

  public static JaxHashedSessionTokenValue assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxHashedSessionTokenValue::new);
  }

  public static JaxHashedSessionTokenValue assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxHashedSessionTokenValue::new, required);
  }

  public static String extract(JaxHashedSessionTokenValue wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxHashedSessionTokenValue.class);
  }

  public static String extract(JaxHashedSessionTokenValue wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxHashedSessionTokenValue.class, required);
  }
}
