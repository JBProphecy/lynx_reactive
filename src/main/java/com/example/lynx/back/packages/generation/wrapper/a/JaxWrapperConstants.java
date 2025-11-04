package com.example.lynx.back.packages.generation.wrapper.a;

import java.nio.file.Path;

import com.example.lynx.flex.a.utilities.JaxPathUtils;

public final class JaxWrapperConstants
{
  public static final String JAX_UUID_FQCN = "com.example.lynx.core.c.utility.types.JaxUUID";
  public static final String JAX_WRAPPER_FQCN = "com.example.lynx.core.e.wrapper.JaxWrapper";
  public static final String JAX_WRAPPER_UTILS_FQCN = "com.example.lynx.core.e.wrapper.JaxWrapperUtils";

  public static final Path JAX_WRAPPER_DIRECTORY = Path.of("src/main/java/com/example/lynx/back/modules/generation/wrapper/output");
  public static final String JAX_WRAPPER_PACKAGE = JaxPathUtils.derivePackageNameFromSourcePath(JAX_WRAPPER_DIRECTORY);

  public static final Path JAX_JAVA_TYPE_DIRECTORY = Path.of("src/main/java/com/example/spring_boot_experimental/app/v18/types/hibernate");
  public static final String JAX_JAVA_TYPE_PACKAGE = JaxPathUtils.derivePackageNameFromSourcePath(JAX_JAVA_TYPE_DIRECTORY);

  private static final String JAX_TYPE_CONTRIBUTOR_CLASS_NAME = "JaxTypeContributor";
  public static final Path JAX_TYPE_CONTRIBUTOR_FILE_PATH = JaxPathUtils.buildFilePathJava(JAX_JAVA_TYPE_DIRECTORY, JAX_TYPE_CONTRIBUTOR_CLASS_NAME);
  public static final String JAX_TYPE_CONTRIBUTOR_FQCN = JaxPathUtils.buildFullyQualifiedClassName(JAX_JAVA_TYPE_PACKAGE, JAX_TYPE_CONTRIBUTOR_CLASS_NAME);

  public static final Path TYPE_CONTRIBUTOR_DIRECTORY = Path.of("src/main/resources/META-INF/services");
  public static final Path TYPE_CONTRIBUTOR_FILE_PATH = TYPE_CONTRIBUTOR_DIRECTORY.resolve("org.hibernate.boot.model.TypeContributor");
}
