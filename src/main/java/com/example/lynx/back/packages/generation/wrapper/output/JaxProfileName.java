package com.example.lynx.back.packages.generation.wrapper.output;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxProfileName extends JaxWrapper<String>
{
  private JaxProfileName(String input) { super(input); }

  public static JaxProfileName require(JaxProfileName wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxProfileName.class);
  }

  public static JaxProfileName assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxProfileName::new);
  }

  public static JaxProfileName assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxProfileName::new, required);
  }

  public static String extract(JaxProfileName wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxProfileName.class);
  }

  public static String extract(JaxProfileName wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxProfileName.class, required);
  }
}
