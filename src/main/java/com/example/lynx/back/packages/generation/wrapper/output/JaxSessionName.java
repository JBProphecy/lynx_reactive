package com.example.lynx.back.packages.generation.wrapper.output;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxSessionName extends JaxWrapper<String>
{
  private JaxSessionName(String input) { super(input); }

  public static JaxSessionName require(JaxSessionName wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxSessionName.class);
  }

  public static JaxSessionName assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxSessionName::new);
  }

  public static JaxSessionName assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxSessionName::new, required);
  }

  public static String extract(JaxSessionName wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxSessionName.class);
  }

  public static String extract(JaxSessionName wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxSessionName.class, required);
  }
}
