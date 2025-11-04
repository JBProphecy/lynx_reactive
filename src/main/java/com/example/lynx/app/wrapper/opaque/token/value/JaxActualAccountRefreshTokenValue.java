package com.example.lynx.app.wrapper.opaque.token.value;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;
import com.example.lynx.flex.a.utilities.JaxOpaqueTokenValueUtility;

public final class JaxActualAccountRefreshTokenValue extends JaxWrapper<String>
{
  private JaxActualAccountRefreshTokenValue(String input) { super(input); }

  public static JaxActualAccountRefreshTokenValue require(JaxActualAccountRefreshTokenValue wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxActualAccountRefreshTokenValue.class);
  }

  public static JaxActualAccountRefreshTokenValue assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualAccountRefreshTokenValue::new);
  }

  public static JaxActualAccountRefreshTokenValue assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualAccountRefreshTokenValue::new, required);
  }

  public static String extract(JaxActualAccountRefreshTokenValue wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxActualAccountRefreshTokenValue.class);
  }

  public static String extract(JaxActualAccountRefreshTokenValue wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxActualAccountRefreshTokenValue.class, required);
  }

  public static JaxActualAccountRefreshTokenValue generate() {
    return new JaxActualAccountRefreshTokenValue(JaxOpaqueTokenValueUtility.generate());
  }

  public JaxHashedAccountRefreshTokenValue hash() {
    return JaxHashedAccountRefreshTokenValue.assign(JaxOpaqueTokenValueUtility.hash(this.extract()));
  }
}
