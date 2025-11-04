package com.example.lynx.back.packages.generation.wrapper.output;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxAccountEmail extends JaxWrapper<String>
{
  private JaxAccountEmail(String input) { super(input); }

  public static JaxAccountEmail require(JaxAccountEmail wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxAccountEmail.class);
  }

  public static JaxAccountEmail assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxAccountEmail::new);
  }

  public static JaxAccountEmail assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxAccountEmail::new, required);
  }

  public static String extract(JaxAccountEmail wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxAccountEmail.class);
  }

  public static String extract(JaxAccountEmail wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxAccountEmail.class, required);
  }
}
