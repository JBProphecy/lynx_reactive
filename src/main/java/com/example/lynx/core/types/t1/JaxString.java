package com.example.lynx.core.types.t1;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;
import com.fasterxml.jackson.core.type.TypeReference;

public final class JaxString
{
  private JaxString() { throw JaxForbiddenConstructorException.create(JaxString.class); }

  public static final String EMPTY = "";
  public static final String REDACTED = "REDACTED";

  public static final String BACKSLASH = "\\";
  public static final String ESCAPED_BACKSLASH = "\\\\";
  
  public static final String DOUBLE_QUOTE = "\"";
  public static final String ESCAPED_DOUBLE_QUOTE = "\\\"";

  public static String require(String self) {
    return JaxEntity.require(self, String.class);
  }

  public static String join(CharSequence separator, CharSequence... sequences) {
    JaxCharSequence.require(separator);
    JaxEntity.require(sequences, CharSequence[].class);
    for (CharSequence sequence : sequences) {
      JaxCharSequence.require(sequence);
    }
    return String.join(separator, sequences);
  }

  public static String join(CharSequence separator, Iterable<? extends CharSequence> sequences) {
    JaxCharSequence.require(separator);
    JaxEntity.require(sequences, new TypeReference<Iterable<? extends CharSequence>>() {} );
    for (CharSequence sequence : sequences) {
      JaxCharSequence.require(sequence);
    }
    return String.join(separator, sequences);
  }
}
