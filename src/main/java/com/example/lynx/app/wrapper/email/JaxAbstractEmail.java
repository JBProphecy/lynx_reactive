package com.example.lynx.app.wrapper.email;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public abstract class JaxAbstractEmail extends JaxWrapper<String>
{
  protected JaxAbstractEmail(String input) { super(input); }

  public static JaxAbstractEmail require(JaxAbstractEmail wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxAbstractEmail.class);
  }

  public static String extract(JaxAbstractEmail wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxAbstractEmail.class);
  }

  public static String extract(JaxAbstractEmail wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxAbstractEmail.class, required);
  }
}
