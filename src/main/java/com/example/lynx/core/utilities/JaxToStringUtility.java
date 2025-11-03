package com.example.lynx.core.utilities;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t1.JaxString;

public final class JaxToStringUtility
{
  private JaxToStringUtility() { throw JaxForbiddenConstructorException.create(JaxToStringUtility.class); }

  public static String buildAttribute(String name, Object value) {
    return JaxString.require(name) + "=" + String.valueOf(value);
  }

  private static String joinAttributes(String... attributes) {
    return JaxString.join(", ", attributes);
  }

  public static String buildClassString(Class<?> clazz) {
    return clazz.getSimpleName() + "()";
  }

  public static String buildClassString(Class<?> clazz, String attribute) {
    return clazz.getSimpleName() + "(" + attribute + ")";
  }

  public static String buildClassString(Class<?> clazz, String... attributes) {
    return clazz.getSimpleName() + "(" + joinAttributes(attributes) + ")";
  }

  public static String buildEnumString(Enum<?> constant) {
    return buildClassString(constant.getClass(), constant.name());
  }
}
