package com.example.lynx.core.c1.utilities.u0.types.t0;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c0.exception.e1.JaxNullObjectException;
import com.fasterxml.jackson.core.type.TypeReference;

public final class JaxEntity
{
  private JaxEntity() { throw JaxForbiddenConstructorException.create(JaxEntity.class); }

  /**
   * <h4>Summary</h4>
   * <ul>
   * <li>This method will determine whether or not an instance of {@code T} is null.</li>
   * <li>This method will return {@code true} if the argument for {@code input} is null.</li>
   * <li>This method will return {@code false} if the argument for {@code input} is not null.</li>
   * </ul>
   * 
   * <h4>Function</h4>
   * <ul>
   * <li>This method will determine whether or not an instance of {@code T} is null.</li>
   * </ul>
   * 
   * <h4>Generics</h4>
   * <ul>
   * <li>{@code T} - can be any reference type</li>
   * </ul>
   * 
   * <h4>Parameters</h4>
   * <ul>
   * <li>{@code input} - is an instance of {@code T} that can be null</li>
   * </ul>
   * 
   * <h4>Returns</h4>
   * <ul>
   * <li>{@code true} if the argument for {@code input} is null</li>
   * <li>{@code false} if the argument for {@code input} is not null</li>
   * </ul>
   * 
   * <h4>Standard</h4>
   */
  public static <T> boolean checkIsNull(T input) {
    return input == null;
  }

  /**
   * <h4>Summary</h4>
   * <ul>
   * <li>This method will determine whether or not an instance of {@code T} is not null.</li>
   * <li>This method will return {@code true} if the argument for {@code input} is not null.</li>
   * <li>This method will return {@code false} if the argument for {@code input} is null.</li>
   * </ul>
   * 
   * <h4>Function</h4>
   * <ul>
   * <li>This method will determine whether or not an instance of {@code T} is not null.</li>
   * </ul>
   * 
   * <h4>Generics</h4>
   * <ul>
   * <li>{@code T} - can be any reference type</li>
   * </ul>
   * 
   * <h4>Parameters</h4>
   * <ul>
   * <li>{@code input} - is an instance of {@code T} that can be null</li>
   * </ul>
   * 
   * <h4>Returns</h4>
   * <ul>
   * <li>{@code true} if the argument for {@code input} is not null</li>
   * <li>{@code false} if the argument for {@code input} is null</li>
   * </ul>
   * 
   * <h4>Standard</h4>
   */
  public static <T> boolean checkIsNotNull(T input) {
    return input != null;
  }

  // LEVEL 0
  public static <T> T require(T object) {
    if (object != null) { return object; }
    throw JaxNullObjectException.create();
  }

  // LEVEL 1 - NAME
  public static <T> T require(T object, String name) {
    if (object != null) { return object; }
    throw JaxNullObjectException.create(name);
  }

  // LEVEL 1 - CLASS
  public static <T> T require(T object, Class<? super T> clazz) {
    if (object != null) { return object; }
    throw JaxNullObjectException.create(clazz);
  }

  // LEVEL 1 - TYPE REFERENCE
  public static <T> T require(T object, TypeReference<? super T> typeReference) {
    if (object != null) { return object; }
    throw JaxNullObjectException.create(typeReference);
  }

  // LEVEL 2 - NAME & CLASS
  public static <T> T require(T object, String name, Class<? super T> clazz) {
    if (object != null) { return object; }
    throw JaxNullObjectException.create(name, clazz);
  }

  // LEVEL 2 - NAME & TYPE REFERENCE
  public static <T> T require(T object, String name, TypeReference<? super T> typeReference) {
    if (object != null) { return object; }
    throw JaxNullObjectException.create(name, typeReference);
  }
}
