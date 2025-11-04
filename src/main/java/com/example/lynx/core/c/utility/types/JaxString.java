package com.example.lynx.core.c.utility.types;

import java.util.Locale;
import java.util.regex.Pattern;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;
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

  public static boolean checkIsEmpty(String input) {
    JaxString.require(input);
    return input.isEmpty();
  }

  public static boolean checkIsNotEmpty(String input) {
    JaxString.require(input);
    return !input.isEmpty();
  }

  public static boolean checkIsBlank(String input) {
    JaxString.require(input);
    return input.isBlank();
  }

  public static boolean checkIsNotBlank(String input) {
    JaxString.require(input);
    return !input.isBlank();
  }

  public static boolean checkIsCertainLength(String input, int length) {
    JaxString.require(input);
    return input.length() == length;
  }

  public static boolean checkIsNotCertainLength(String input, int length) {
    JaxString.require(input);
    return input.length() != length;
  }

  public static boolean checkIsGreaterThanLength(String input, int length) {
    JaxString.require(input);
    return input.length() > length;
  }

  public static boolean checkIsLessThanLength(String input, int length) {
    JaxString.require(input);
    return input.length() < length;
  }

  public static boolean checkIsGreaterThanOrEqualToLength(String input, int length) {
    JaxString.require(input);
    return input.length() >= length;
  }

  public static boolean checkIsLessThanOrEqualToLength(String input, int length) {
    JaxString.require(input);
    return input.length() <= length;
  }

  public static boolean checkStartsWith(String input, String prefix) {
    JaxString.require(input);
    JaxString.require(prefix);
    return input.startsWith(prefix);
  }

  public static boolean checkEndsWith(String input, String suffix) {
    JaxString.require(input);
    JaxString.require(suffix);
    return input.startsWith(suffix);
  }

  public static boolean checkMatchesRegexPattern(String input, Pattern pattern) {
    JaxString.require(input);
    JaxPattern.require(pattern);
    return pattern.matcher(input).matches();
  }

  public static boolean checkIsDoubleQuoted(String input) {
    JaxString.require(input);
    return input.length() >= 2 && input.startsWith(DOUBLE_QUOTE) && input.endsWith(DOUBLE_QUOTE);
  }

  public static int getLength(String input) {
    JaxString.require(input);
    return input.length();
  }

  public static String normalize(String input) {
    JaxString.require(input);
    return input.toUpperCase(Locale.ROOT);
  }

  public static String escapeBackSlashes(String input) {
    JaxString.require(input);
    return input.replace(BACKSLASH, ESCAPED_BACKSLASH);
  }

  public static String escapeDoubleQuotes(String input) {
    JaxString.require(input);
    return input.replace(DOUBLE_QUOTE, ESCAPED_DOUBLE_QUOTE);
  }

  public static String escapeBackSlashesAndDoubleQuotes(String input) {
    final String one = JaxString.escapeBackSlashes(input);
    final String two = JaxString.escapeDoubleQuotes(one);
    return two;
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
