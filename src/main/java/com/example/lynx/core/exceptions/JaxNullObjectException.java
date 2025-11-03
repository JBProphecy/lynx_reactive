package com.example.lynx.core.exceptions;

import com.example.lynx.core.exception.JaxBasicRuntimeException;
import com.fasterxml.jackson.core.type.TypeReference;

public final class JaxNullObjectException extends JaxBasicRuntimeException
{
  private JaxNullObjectException(String message) {
    super(message);
  }

  // Generate Jax Null Object Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will generate an instance of {@link JaxNullObjectException}.</li>
   * </ul>
   * 
   * <h4>Returns</h4>
   * <ul>
   * <li>an instance of {@link JaxNullObjectException}</li>
   * </ul>
   */
  public static JaxNullObjectException generate() {
    return new JaxNullObjectException("An object is null and must not be null.");
  }

  // Generate Jax Null Object Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will generate an instance of {@link JaxNullObjectException}.</li>
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
  public static JaxNullObjectException generate(String name) {
    if (name == null) { return JaxNullObjectException.generate(); }
    return new JaxNullObjectException(String.format("An object named [%s] is null and must not be null.", name));
  }

  // Generate Jax Null Object Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will generate an instance of {@link JaxNullObjectException}.</li>
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
  public static JaxNullObjectException generate(Class<?> clazz) {
    if (clazz == null) { return JaxNullObjectException.generate(); }
    return new JaxNullObjectException(String.format("An object of the expected class [%s] is null and must not be null.", clazz.getSimpleName()));
  }

  // Generate Jax Null Object Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will generate an instance of {@link JaxNullObjectException}.</li>
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
  public static JaxNullObjectException generate(TypeReference<?> typeReference) {
    if (typeReference == null) { return JaxNullObjectException.generate(); }
    return new JaxNullObjectException(String.format("An object of the expected type [%s] is null and must not be null.", typeReference.getType().getTypeName()));
  }

  // Generate Jax Null Object Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will generate an instance of {@link JaxNullObjectException}.</li>
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
  public static JaxNullObjectException generate(String name, Class<?> clazz) {
    if (name == null) { return JaxNullObjectException.generate(clazz); }
    if (clazz == null) { return JaxNullObjectException.generate(name); }
    return new JaxNullObjectException(String.format("An object named [%s] of the expected class [%s] is null and must not be null.", name, clazz.getSimpleName()));
  }
  
  // Generate Jax Null Object Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will generate an instance of {@link JaxNullObjectException}.</li>
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
  public static JaxNullObjectException generate(String name, TypeReference<?> typeReference) {
    if (name == null) { return JaxNullObjectException.generate(typeReference); }
    if (typeReference == null) { return JaxNullObjectException.generate(name); }
    return new JaxNullObjectException(String.format("An object named [%s] of the expected type [%s] is null and must not be null.", name, typeReference.getType().getTypeName()));
  }
}
