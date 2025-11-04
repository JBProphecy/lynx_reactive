package com.example.lynx.core.b.exceptions;

import com.example.lynx.core.a.exception.JaxBasicRuntimeException;
import com.fasterxml.jackson.core.type.TypeReference;

public final class JaxNullObjectException extends JaxBasicRuntimeException
{
  private JaxNullObjectException(String message) {
    super(message);
  }

  // Create Jax Null Object Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will create an instance of {@link JaxNullObjectException}.</li>
   * </ul>
   * 
   * <h4>Returns</h4>
   * <ul>
   * <li>an instance of {@link JaxNullObjectException}</li>
   * </ul>
   */
  public static JaxNullObjectException create() {
    return new JaxNullObjectException("An object is null and must not be null.");
  }

  // Create Jax Null Object Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will create an instance of {@link JaxNullObjectException}.</li>
   * </ul>
   * 
   * <h4>Parameters</h4>
   * <ul>
   * <li>{@code name} - an arbitrary name for the null object (typically the name of a variable)</li>
   * </ul>
   * 
   * <h4>Returns</h4>
   * <ul>
   * <li>an instance of {@link JaxNullObjectException}</li>
   * </ul>
   * 
   * <h4>Standard</h4>
   */
  public static JaxNullObjectException create(String name) {
    if (name == null) { return JaxNullObjectException.create(); }
    return new JaxNullObjectException(String.format("An object named [%s] is null and must not be null.", name));
  }

  // Create Jax Null Object Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will create an instance of {@link JaxNullObjectException}.</li>
   * </ul>
   * 
   * <h4>Parameters</h4>
   * <ul>
   * <li>{@code clazz} - an instance of {@code Class<T>} (for the null object)</li>
   * </ul>
   * 
   * <h4>Returns</h4>
   * <ul>
   * <li>an instance of {@link JaxNullObjectException}</li>
   * </ul>
   * 
   * <h4>Standard</h4>
   */
  public static JaxNullObjectException create(Class<?> clazz) {
    if (clazz == null) { return JaxNullObjectException.create(); }
    return new JaxNullObjectException(String.format("An object of the expected class [%s] is null and must not be null.", clazz.getSimpleName()));
  }

  // Create Jax Null Object Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will create an instance of {@link JaxNullObjectException}.</li>
   * </ul>
   * 
   * <h4>Parameters</h4>
   * <ul>
   * <li>{@code typeReference} - an instance of {@code TypeReference<T>} (for the null object)</li>
   * </ul>
   * 
   * <h4>Returns</h4>
   * <ul>
   * <li>an instance of {@link JaxNullObjectException}</li>
   * </ul>
   * 
   * <h4>Standard</h4>
   */
  public static JaxNullObjectException create(TypeReference<?> typeReference) {
    if (typeReference == null) { return JaxNullObjectException.create(); }
    return new JaxNullObjectException(String.format("An object of the expected type [%s] is null and must not be null.", typeReference.getType().getTypeName()));
  }

  // Create Jax Null Object Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will create an instance of {@link JaxNullObjectException}.</li>
   * </ul>
   * 
   * <h4>Parameters</h4>
   * <ul>
   * <li>{@code name} - an arbitrary name for the null object (typically the name of a variable)</li>
   * <li>{@code clazz} - an instance of {@code Class<T>} (for the null object)</li>
   * </ul>
   * 
   * <h4>Returns</h4>
   * <ul>
   * <li>an instance of {@link JaxNullObjectException}</li>
   * </ul>
   * 
   * <h4>Standard</h4>
   */
  public static JaxNullObjectException create(String name, Class<?> clazz) {
    if (name == null) { return JaxNullObjectException.create(clazz); }
    if (clazz == null) { return JaxNullObjectException.create(name); }
    return new JaxNullObjectException(String.format("An object named [%s] of the expected class [%s] is null and must not be null.", name, clazz.getSimpleName()));
  }
  
  // Create Jax Null Object Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will create an instance of {@link JaxNullObjectException}.</li>
   * </ul>
   * 
   * <h4>Parameters</h4>
   * <ul>
   * <li>{@code name} - an arbitrary name for the null object (typically the name of a variable)</li>
   * <li>{@code typeReference} - an instance of {@code TypeReference<T>} (for the null object)</li>
   * </ul>
   * 
   * <h4>Returns</h4>
   * <ul>
   * <li>an instance of {@link JaxNullObjectException}</li>
   * </ul>
   * 
   * <h4>Standard</h4>
   */
  public static JaxNullObjectException create(String name, TypeReference<?> typeReference) {
    if (name == null) { return JaxNullObjectException.create(typeReference); }
    if (typeReference == null) { return JaxNullObjectException.create(name); }
    return new JaxNullObjectException(String.format("An object named [%s] of the expected type [%s] is null and must not be null.", name, typeReference.getType().getTypeName()));
  }
}
