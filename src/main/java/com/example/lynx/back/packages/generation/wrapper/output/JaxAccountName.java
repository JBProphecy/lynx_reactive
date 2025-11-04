package com.example.lynx.back.packages.generation.wrapper.output;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxAccountName extends JaxWrapper<String>
{
  private JaxAccountName(String input) { super(input); }

  public static JaxAccountName require(JaxAccountName wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxAccountName.class);
  }

  public static JaxAccountName assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxAccountName::new);
  }

  public static JaxAccountName assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxAccountName::new, required);
  }

  public static String extract(JaxAccountName wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxAccountName.class);
  }

  public static String extract(JaxAccountName wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxAccountName.class, required);
  }
}
