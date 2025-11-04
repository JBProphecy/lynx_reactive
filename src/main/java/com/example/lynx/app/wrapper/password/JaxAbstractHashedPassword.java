package com.example.lynx.app.wrapper.password;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public abstract class JaxAbstractHashedPassword extends JaxWrapper<String>
{
  protected JaxAbstractHashedPassword(String input) { super(input); }

  public static JaxAbstractHashedPassword require(JaxAbstractHashedPassword wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxAbstractHashedPassword.class);
  }

  public static String extract(JaxAbstractHashedPassword wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxAbstractHashedPassword.class);
  }

  public static String extract(JaxAbstractHashedPassword wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxAbstractHashedPassword.class, required);
  }
}
