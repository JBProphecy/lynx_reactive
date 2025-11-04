package com.example.lynx.flex.a.utilities;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxFileWriterUtils
{
  private JaxFileWriterUtils() { throw JaxForbiddenConstructorException.create(JaxFileWriterUtils.class); }
  
  public static final int TAB_SPACES = 2;

  public static String t(int t) {
    return " ".repeat(t * TAB_SPACES);
  }

  public static String n(int n) {
    return "\n".repeat(n);
  }

  public static String buildPackageDeclarationString(String packageName) {
    return String.format("package %s;", packageName);
  }

  public static String buildImportStatementString(String fullyQualifiedClassName) {
    return String.format("import %s;", fullyQualifiedClassName);
  }
}
