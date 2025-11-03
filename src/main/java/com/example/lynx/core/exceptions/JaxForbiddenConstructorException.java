package com.example.lynx.core.exceptions;

import com.example.lynx.core.exception.JaxBasicRuntimeException;

public final class JaxForbiddenConstructorException extends JaxBasicRuntimeException
{
  private JaxForbiddenConstructorException(String message) {
    super(message);
  }

  // Generate Jax Forbidden Constructor Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will generate an instance of {@link JaxForbiddenConstructorException}.</li>
   * </ul>
   * 
   * <h4>Returns</h4>
   * <ul>
   * <li>an instance of {@link JaxForbiddenConstructorException}</li>
   * </ul>
   */
  public static JaxForbiddenConstructorException create() {
    return new JaxForbiddenConstructorException("A constructor was called and that process is forbidden.");
  }

  // Generate Jax Forbidden Constructor Runtime Exception
  /**
   * <h4>Function</h4>
   * <ul>
   * <li>This method will generate an instance of {@link JaxForbiddenConstructorException}.</li>
   * </ul>
   * 
   * <h4>Parameters</h4>
   * <ul>
   * <li>{@code clazz} - an instance of {@code Class<?>} (for the class that should not be constructed)</li>
   * </ul>
   * 
   * <h4>Conditions</h4>
   * <ul>
   * <li>If the argument for {@code clazz} is null, this method will call the overload of this method that has all the same parameters except for {@code clazz}.</li>
   * </ul>
   * 
   * <h4>Returns</h4>
   * <ul>
   * <li>an instance of {@link JaxForbiddenConstructorException}</li>
   * </ul>
   * 
   * <h4>Standard</h4>
   */
  public static JaxForbiddenConstructorException create(Class<?> clazz) {
    if (clazz == null) { return JaxForbiddenConstructorException.create(); }
    return new JaxForbiddenConstructorException(String.format("A constructor for the class [%s] was called and that process is forbidden.", clazz.getName()));
  }
}
