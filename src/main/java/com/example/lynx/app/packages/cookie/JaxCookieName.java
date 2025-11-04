package com.example.lynx.app.packages.cookie;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxCookieName extends JaxWrapper<String>
{
  private JaxCookieName(String input) { super(input); }

  public static JaxCookieName require(JaxCookieName wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxCookieName.class);
  }

  public static JaxCookieName assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxCookieName::new);
  }

  public static JaxCookieName assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxCookieName::new, required);
  }

  public static String extract(JaxCookieName wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxCookieName.class);
  }

  public static String extract(JaxCookieName wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxCookieName.class, required);
  }
}
