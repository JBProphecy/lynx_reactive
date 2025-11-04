package com.example.lynx.flex.a.utilities;

import java.io.File;
import java.nio.file.Path;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxPathUtils
{
  private JaxPathUtils() { throw JaxForbiddenConstructorException.create(JaxPathUtils.class); }

  public static final Path SOURCE_PATH_ROOT = Path.of("src/main/java");

  public static Path buildFilePath(Path directory, String fileName, String extension) {
    return directory.resolve(fileName + extension);
  }

  public static Path buildFilePathJava(Path directory, String fileName) {
    return buildFilePath(directory, fileName, ".java");
  }

  public static String buildFullyQualifiedClassName(String packageName, String className) {
    return packageName + "." + className;
  }

  public static String derivePackageNameFromSourcePath(Path fullDirectoryPathFromSrc) {
    return SOURCE_PATH_ROOT.relativize(fullDirectoryPathFromSrc).toString().replace(File.separatorChar, '.');
  }
}
