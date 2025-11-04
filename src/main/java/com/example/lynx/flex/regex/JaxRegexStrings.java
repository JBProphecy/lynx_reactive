package com.example.lynx.flex.regex;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;

public final class JaxRegexStrings
{
  private JaxRegexStrings() { throw JaxForbiddenConstructorException.create(JaxRegexStrings.class); }

  public static final String BASE_64_URL_WITHOUT_PADDING_FROM_32_BYTES_VALID_FORMAT = "^[A-Za-z0-9_-]{43}$";

  public static final String OPAQUE_TOKEN_VALUE_VALID_FORMAT = BASE_64_URL_WITHOUT_PADDING_FROM_32_BYTES_VALID_FORMAT;

  public static final String COOKIE_NAME_VALID_FORMAT = "^[!#$%&'*+\\-.^_`|~0-9a-zA-Z]+$";
  public static final String COOKIE_VALUE_VALID_FORMAT = "^[\\x21\\x23-\\x2B\\x2D-\\x3A\\x3C-\\x5B\\x5D-\\x7E]+$";
  public static final String COOKIE_PATH_VALID_FORMAT = "^\\/[\\x20-\\x7E]*$";
  public static final String COOKIE_DOMAIN_VALID_FORMAT = "^(?:\\.[a-zA-Z0-9-]+)+$";

  public static final String NAME_VALID_FORMAT = "^[A-Za-z]+$";
  public static final String EMAIL_VALID_FORMAT = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
  public static final String USERNAME_VALID_FORMAT = "^(?! )(?!.*  )[\\w!#$%\\-=+? ]+(?<! )$";
  public static final String PASSWORD_VALID_CHARACTERS = "^[\\x21-\\x7E]*$";

  public static final String EMAIL_VERIFICATION_CODE_VALID_FORMAT = "^\\d{6}$";
}
