package com.example.lynx.back.packages.generation.wrapper.output;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxProfileUsername extends JaxWrapper<String>
{
  private JaxProfileUsername(String input) { super(input); }

  public static JaxProfileUsername require(JaxProfileUsername wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxProfileUsername.class);
  }

  public static JaxProfileUsername assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxProfileUsername::new);
  }

  public static JaxProfileUsername assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxProfileUsername::new, required);
  }

  public static String extract(JaxProfileUsername wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxProfileUsername.class);
  }

  public static String extract(JaxProfileUsername wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxProfileUsername.class, required);
  }
}
