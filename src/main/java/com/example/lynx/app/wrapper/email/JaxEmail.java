package com.example.lynx.app.wrapper.email;

import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxEmail extends JaxAbstractEmail
{
  private JaxEmail(String input) { super(input); }

  public static JaxEmail require(JaxEmail wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxEmail.class);
  }

  public static JaxEmail assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxEmail::new);
  }

  public static JaxEmail assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxEmail::new, required);
  }

  public static String extract(JaxEmail wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxEmail.class);
  }

  public static String extract(JaxEmail wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxEmail.class, required);
  }
}
