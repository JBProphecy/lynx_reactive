package com.example.lynx.app.wrapper.opaque.token.value;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;
import com.example.lynx.flex.a.utilities.JaxOpaqueTokenValueUtility;

public final class JaxActualSessionTokenValue extends JaxWrapper<String>
{
  private JaxActualSessionTokenValue(String input) { super(input); }

  public static JaxActualSessionTokenValue require(JaxActualSessionTokenValue wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxActualSessionTokenValue.class);
  }

  public static JaxActualSessionTokenValue assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualSessionTokenValue::new);
  }

  public static JaxActualSessionTokenValue assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualSessionTokenValue::new, required);
  }

  public static String extract(JaxActualSessionTokenValue wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxActualSessionTokenValue.class);
  }

  public static String extract(JaxActualSessionTokenValue wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxActualSessionTokenValue.class, required);
  }

  public static JaxActualSessionTokenValue generate() {
    return new JaxActualSessionTokenValue(JaxOpaqueTokenValueUtility.generate());
  }

  public JaxHashedSessionTokenValue hash() {
    return JaxHashedSessionTokenValue.assign(JaxOpaqueTokenValueUtility.hash(this.extract()));
  }
}
