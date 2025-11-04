package com.example.lynx.core.c2.wrapper.w0;

import java.util.function.Function;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c0.exception.e1.JaxNullObjectException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;
import com.fasterxml.jackson.core.type.TypeReference;

public final class JaxWrapperUtils
{
  private JaxWrapperUtils() { throw JaxForbiddenConstructorException.create(JaxWrapperUtils.class); }

  // ---------- CLASS ---------- //

  public static <SELF extends JaxWrapper<?>> SELF require(SELF wrapper, Class<SELF> clazz) {
    return JaxEntity.require(wrapper, clazz);
  }

  public static <T, SELF extends JaxWrapper<T>> SELF assign(T value, Class<T> clazz, Function<T, SELF> constructor) {
    if (value != null) { return constructor.apply(value); }
    throw JaxNullObjectException.create(clazz);
  }

  public static <T, SELF extends JaxWrapper<T>> SELF assign(T value, Class<T> clazz, Function<T, SELF> constructor, boolean required) {
    if (value != null) { return constructor.apply(value); }
    if (required) { throw JaxNullObjectException.create(clazz); }
    return null;
  }

  public static <T, SELF extends JaxWrapper<T>> T extract(SELF wrapper, Class<SELF> clazz) {
    if (wrapper != null) { return wrapper.extract(); }
    throw JaxNullObjectException.create(clazz);
  }

  public static <T, SELF extends JaxWrapper<T>> T extract(SELF wrapper, Class<SELF> clazz, boolean required) {
    if (wrapper != null) { return wrapper.extract(); }
    if (required) { throw JaxNullObjectException.create(clazz); }
    return null;
  }

  // ---------- TYPE REFERENCE ---------- //

  public static <SELF extends JaxWrapper<?>> SELF require(SELF wrapper, TypeReference<SELF> typeReference) {
    return JaxEntity.require(wrapper, typeReference);
  }

  public static <T, SELF extends JaxWrapper<T>> SELF assign(T value, TypeReference<T> typeReference, Function<T, SELF> constructor) {
    if (value != null) { return constructor.apply(value); }
    throw JaxNullObjectException.create(typeReference);
  }

  public static <T, SELF extends JaxWrapper<T>> SELF assign(T value, TypeReference<T> typeReference, Function<T, SELF> constructor, boolean required) {
    if (value != null) { return constructor.apply(value); }
    if (required) { throw JaxNullObjectException.create(typeReference); }
    return null;
  }

  public static <T, SELF extends JaxWrapper<T>> T extract(SELF wrapper, TypeReference<SELF> typeReference) {
    if (wrapper != null) { return wrapper.extract(); }
    throw JaxNullObjectException.create(typeReference);
  }

  public static <T, SELF extends JaxWrapper<T>> T extract(SELF wrapper, TypeReference<SELF> typeReference, boolean required) {
    if (wrapper != null) { return wrapper.extract(); }
    if (required) { throw JaxNullObjectException.create(typeReference); }
    return null;
  }
}
