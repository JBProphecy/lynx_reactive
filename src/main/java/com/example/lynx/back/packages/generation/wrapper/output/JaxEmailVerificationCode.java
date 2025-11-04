package com.example.lynx.back.packages.generation.wrapper.output;

import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxEmailVerificationCode extends JaxWrapper<String>
{
  private JaxEmailVerificationCode(String input) { super(input); }

  public static JaxEmailVerificationCode require(JaxEmailVerificationCode wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxEmailVerificationCode.class);
  }

  public static JaxEmailVerificationCode assign(String value) {
    return JaxWrapperUtils.assign(value, String.class, JaxEmailVerificationCode::new);
  }

  public static JaxEmailVerificationCode assign(String value, boolean required) {
    return JaxWrapperUtils.assign(value, String.class, JaxEmailVerificationCode::new, required);
  }

  public static String extract(JaxEmailVerificationCode wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxEmailVerificationCode.class);
  }

  public static String extract(JaxEmailVerificationCode wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxEmailVerificationCode.class, required);
  }
}
