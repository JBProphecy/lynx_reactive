package com.example.lynx.back.packages.generation.wrapper.output;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxAccountAccessTokenValue extends JaxWrapper<String>
{
  private JaxAccountAccessTokenValue(String input) { super(input); }

  public static JaxAccountAccessTokenValue require(JaxAccountAccessTokenValue wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxAccountAccessTokenValue.class);
  }

  public static JaxAccountAccessTokenValue assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxAccountAccessTokenValue::new);
  }

  public static JaxAccountAccessTokenValue assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxAccountAccessTokenValue::new, required);
  }

  public static String extract(JaxAccountAccessTokenValue wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxAccountAccessTokenValue.class);
  }

  public static String extract(JaxAccountAccessTokenValue wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxAccountAccessTokenValue.class, required);
  }
}
