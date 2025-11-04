package com.example.lynx.flex.a.regex;

import java.util.regex.Pattern;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxRegexPatterns
{
  private JaxRegexPatterns() { throw JaxForbiddenConstructorException.create(JaxRegexPatterns.class); }

  public static final Pattern BASE_64_URL_WITHOUT_PADDING_FROM_32_BYTES_VALID_FORMAT = Pattern.compile(JaxRegexStrings.BASE_64_URL_WITHOUT_PADDING_FROM_32_BYTES_VALID_FORMAT);
  
  public static final Pattern OPAQUE_TOKEN_VALUE_VALID_FORMAT = BASE_64_URL_WITHOUT_PADDING_FROM_32_BYTES_VALID_FORMAT;

  public static final Pattern COOKIE_NAME_VALID_FORMAT = Pattern.compile(JaxRegexStrings.COOKIE_NAME_VALID_FORMAT);
  public static final Pattern COOKIE_VALUE_VALID_FORMAT = Pattern.compile(JaxRegexStrings.COOKIE_VALUE_VALID_FORMAT);
  public static final Pattern COOKIE_PATH_VALID_FORMAT = Pattern.compile(JaxRegexStrings.COOKIE_PATH_VALID_FORMAT);
  public static final Pattern COOKIE_DOMAIN_VALID_FORMAT = Pattern.compile(JaxRegexStrings.COOKIE_DOMAIN_VALID_FORMAT);

  public static final Pattern NAME_VALID_FORMAT = Pattern.compile(JaxRegexStrings.NAME_VALID_FORMAT);
  public static final Pattern EMAIL_VALID_FORMAT = Pattern.compile(JaxRegexStrings.EMAIL_VALID_FORMAT);
  public static final Pattern USERNAME_VALID_FORMAT = Pattern.compile(JaxRegexStrings.USERNAME_VALID_FORMAT);
  public static final Pattern PASSWORD_VALID_CHARACTERS = Pattern.compile(JaxRegexStrings.PASSWORD_VALID_CHARACTERS);

  public static final Pattern EMAIL_VERIFICATION_CODE_VALID_FORMAT = Pattern.compile(JaxRegexStrings.EMAIL_VERIFICATION_CODE_VALID_FORMAT);
}
