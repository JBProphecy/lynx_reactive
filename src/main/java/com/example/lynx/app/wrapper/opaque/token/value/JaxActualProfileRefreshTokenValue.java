package com.example.lynx.app.wrapper.opaque.token.value;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;
import com.example.lynx.flex.a.utilities.JaxOpaqueTokenValueUtility;

public final class JaxActualProfileRefreshTokenValue extends JaxWrapper<String>
{
  private JaxActualProfileRefreshTokenValue(String input) { super(input); }

  public static JaxActualProfileRefreshTokenValue require(JaxActualProfileRefreshTokenValue wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxActualProfileRefreshTokenValue.class);
  }

  public static JaxActualProfileRefreshTokenValue assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualProfileRefreshTokenValue::new);
  }

  public static JaxActualProfileRefreshTokenValue assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxActualProfileRefreshTokenValue::new, required);
  }

  public static String extract(JaxActualProfileRefreshTokenValue wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxActualProfileRefreshTokenValue.class);
  }

  public static String extract(JaxActualProfileRefreshTokenValue wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxActualProfileRefreshTokenValue.class, required);
  }

  public static JaxActualProfileRefreshTokenValue generate() {
    return new JaxActualProfileRefreshTokenValue(JaxOpaqueTokenValueUtility.generate());
  }

  public JaxHashedProfileRefreshTokenValue hash() {
    return JaxHashedProfileRefreshTokenValue.assign(JaxOpaqueTokenValueUtility.hash(this.extract()));
  }
}
