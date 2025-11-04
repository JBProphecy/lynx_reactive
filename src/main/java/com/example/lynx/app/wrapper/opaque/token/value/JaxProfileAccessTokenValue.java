package com.example.lynx.app.wrapper.opaque.token.value;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;
import com.example.lynx.flex.a.utilities.JaxOpaqueTokenValueUtility;

public final class JaxProfileAccessTokenValue extends JaxWrapper<String>
{
  private JaxProfileAccessTokenValue(String input) { super(input); }

  public static JaxProfileAccessTokenValue require(JaxProfileAccessTokenValue wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxProfileAccessTokenValue.class);
  }

  public static JaxProfileAccessTokenValue assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxProfileAccessTokenValue::new);
  }

  public static JaxProfileAccessTokenValue assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxProfileAccessTokenValue::new, required);
  }

  public static String extract(JaxProfileAccessTokenValue wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxProfileAccessTokenValue.class);
  }

  public static String extract(JaxProfileAccessTokenValue wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxProfileAccessTokenValue.class, required);
  }

  public static JaxProfileAccessTokenValue generate() {
    return new JaxProfileAccessTokenValue(JaxOpaqueTokenValueUtility.generate());
  }
}
