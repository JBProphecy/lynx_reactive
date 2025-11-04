package com.example.lynx.app.wrapper.password;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public abstract class JaxAbstractActualPassword extends JaxWrapper<String>
{
  protected JaxAbstractActualPassword(String input) { super(input); }

  public static JaxAbstractActualPassword require(JaxAbstractActualPassword wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxAbstractActualPassword.class);
  }

  public static String extract(JaxAbstractActualPassword wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxAbstractActualPassword.class);
  }

  public static String extract(JaxAbstractActualPassword wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxAbstractActualPassword.class, required);
  }
}
