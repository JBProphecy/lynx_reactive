package com.example.lynx.app.wrapper.email;

import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxAccountEmail extends JaxAbstractEmail
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
