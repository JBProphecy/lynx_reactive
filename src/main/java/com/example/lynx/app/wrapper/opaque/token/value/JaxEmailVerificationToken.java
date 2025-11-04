package com.example.lynx.app.wrapper.opaque.token.value;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;
import com.example.lynx.flex.a.utilities.JaxOpaqueTokenValueUtility;

public final class JaxEmailVerificationToken extends JaxWrapper<String>
{
  private JaxEmailVerificationToken(String input) { super(input); }

  public static JaxEmailVerificationToken require(JaxEmailVerificationToken wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxEmailVerificationToken.class);
  }

  public static JaxEmailVerificationToken assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxEmailVerificationToken::new);
  }

  public static JaxEmailVerificationToken assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxEmailVerificationToken::new, required);
  }

  public static String extract(JaxEmailVerificationToken wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxEmailVerificationToken.class);
  }

  public static String extract(JaxEmailVerificationToken wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxEmailVerificationToken.class, required);
  }

  public static JaxEmailVerificationToken generate() {
    return new JaxEmailVerificationToken(JaxOpaqueTokenValueUtility.generate());
  }
}
