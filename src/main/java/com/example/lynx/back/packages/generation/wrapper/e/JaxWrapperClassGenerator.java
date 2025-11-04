package com.example.lynx.back.packages.generation.wrapper.e;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import com.example.lynx.back.packages.generation.wrapper.a.JaxWrappedTypeVariant;
import com.example.lynx.back.packages.generation.wrapper.a.JaxWrapperConstants;
import com.example.lynx.back.packages.generation.wrapper.b.JaxWrapperDefinition;
import com.example.lynx.back.packages.generation.wrapper.c.JaxWrapperDefinitions;
import com.example.lynx.back.packages.generation.wrapper.d.JaxWrapperConfiguration;
import com.example.lynx.flex.a.utilities.JaxFileWriterUtils;

public final class JaxWrapperClassGenerator
{
  private static final String t0 = JaxFileWriterUtils.t(0);
  private static final String t1 = JaxFileWriterUtils.t(1);
  private static final String t2 = JaxFileWriterUtils.t(2);
  private static final String n1 = JaxFileWriterUtils.n(1);
  private static final String n2 = JaxFileWriterUtils.n(2);

  private static final String JAX_UUID_FQCN = JaxWrapperConstants.JAX_UUID_FQCN;
  private static final String JAX_WRAPPER_FQCN = JaxWrapperConstants.JAX_WRAPPER_FQCN;
  private static final String JAX_WRAPPER_UTILS_FQCN = JaxWrapperConstants.JAX_WRAPPER_UTILS_FQCN;
  
  private static final Path JAX_WRAPPER_DIRECTORY = JaxWrapperConstants.JAX_WRAPPER_DIRECTORY;
  private static final String JAX_WRAPPER_PACKAGE = JaxWrapperConstants.JAX_WRAPPER_PACKAGE;

  private static final JaxWrapperDefinitions JAX_WRAPPER_DEFINITIONS = JaxWrapperConfiguration.DEFINITIONS;

  public static void main(String[] args) throws IOException {
    handleJaxWrappers();
  }

  public static void handleJaxWrappers() throws IOException {
    if (!Files.exists(JAX_WRAPPER_DIRECTORY)) Files.createDirectories(JAX_WRAPPER_DIRECTORY);
    for (JaxWrapperDefinition jaxWrapperDefinition : JAX_WRAPPER_DEFINITIONS.extract()) {
      final JaxWrappedTypeVariant wrappedType = jaxWrapperDefinition.getWrappedType();
      switch (wrappedType) {
        case STRING -> generateJaxWrapperString(jaxWrapperDefinition);
        case UUID -> generateJaxWrapperUUID(jaxWrapperDefinition);
      }
    }
  }

  private static String generatePrimaryContent(JaxWrapperDefinition jaxWrapperDefinition) throws IOException
  {
    final String jaxWrapperClassName = jaxWrapperDefinition.getJaxWrapperClassName();
    final JaxWrappedTypeVariant wrappedType = jaxWrapperDefinition.getWrappedType();
    final String wrappedTypeName = wrappedType.getClassName();

    final String content =
      t0 + String.format("public final class %s extends JaxWrapper<%s>", jaxWrapperClassName, wrappedTypeName) + n1 +
      t0 + "{" + n1 +
      t1 + String.format("private %s(%s input) { super(input); }", jaxWrapperClassName, wrappedTypeName) + n2 +

      t1 + String.format("public static %s require(%s wrapper) {", jaxWrapperClassName, jaxWrapperClassName) + n1 +
      t2 + String.format("return JaxWrapperUtils.require(wrapper, %s.class);", jaxWrapperClassName) + n1 +
      t1 + "}" + n2 +

      t1 + String.format("public static %s assign(%s value) {", jaxWrapperClassName, wrappedTypeName) + n1 +
      t2 + String.format("return JaxWrapperUtils.assign(value, %s.class, %s::new);", wrappedTypeName, jaxWrapperClassName) + n1 +
      t1 + "}" + n2 +

      t1 + String.format("public static %s assign(%s value, boolean required) {", jaxWrapperClassName, wrappedTypeName) + n1 +
      t2 + String.format("return JaxWrapperUtils.assign(value, %s.class, %s::new, required);", wrappedTypeName, jaxWrapperClassName) + n1 +
      t1 + "}" + n2 +

      t1 + String.format("public static %s extract(%s wrapper) {", wrappedTypeName, jaxWrapperClassName) + n1 +
      t2 + String.format("return JaxWrapperUtils.extract(wrapper, %s.class);", jaxWrapperClassName) + n1 +
      t1 + "}" + n2 +

      t1 + String.format("public static %s extract(%s wrapper, boolean required) {", wrappedTypeName, jaxWrapperClassName) + n1 +
      t2 + String.format("return JaxWrapperUtils.extract(wrapper, %s.class, required);", jaxWrapperClassName) + n1 +
      t1 + "}"
    ;

    return content;
  }

  private static void generateJaxWrapperString(JaxWrapperDefinition jaxWrapperDefinition) throws IOException
  {
    final Path jaxWrapperFilePath = jaxWrapperDefinition.getJaxWrapperFilePath();
    final String jaxWrapperClassName = jaxWrapperDefinition.getJaxWrapperClassName();

    if (Files.exists(jaxWrapperFilePath)) {
      System.out.println(String.format("Skipped Generation for Existing Jax Wrapper [%s]", jaxWrapperFilePath));
      return;
    }

    String fileContent =
      t0 + JaxFileWriterUtils.buildPackageDeclarationString(JAX_WRAPPER_PACKAGE) + n2 +

      t0 + JaxFileWriterUtils.buildImportStatementString(JAX_WRAPPER_FQCN) + n1 +
      t0 + JaxFileWriterUtils.buildImportStatementString(JAX_WRAPPER_UTILS_FQCN) + n2 +

      generatePrimaryContent(jaxWrapperDefinition) + n1 +
      t0 + "}" + n1
    ;

    Files.writeString(jaxWrapperFilePath, fileContent, StandardOpenOption.CREATE_NEW);
    System.out.println(String.format("Generated Jax Wrapper [%s]", jaxWrapperClassName));
  }

  private static void generateJaxWrapperUUID(JaxWrapperDefinition jaxWrapperDefinition) throws IOException
  {
    final Path jaxWrapperFilePath = jaxWrapperDefinition.getJaxWrapperFilePath();
    final String jaxWrapperClassName = jaxWrapperDefinition.getJaxWrapperClassName();

    if (Files.exists(jaxWrapperFilePath)) {
      System.out.println(String.format("Skipped Generation for Existing Jax Wrapper [%s]", jaxWrapperFilePath));
      return;
    }

    String fileContent =
      t0 + JaxFileWriterUtils.buildPackageDeclarationString(JAX_WRAPPER_PACKAGE) + n2 +

      t0 + JaxFileWriterUtils.buildImportStatementString("java.util.UUID") + n2 +

      t0 + JaxFileWriterUtils.buildImportStatementString(JAX_UUID_FQCN) + n1 +
      t0 + JaxFileWriterUtils.buildImportStatementString(JAX_WRAPPER_FQCN) + n1 +
      t0 + JaxFileWriterUtils.buildImportStatementString(JAX_WRAPPER_UTILS_FQCN) + n2 +

      generatePrimaryContent(jaxWrapperDefinition) + n2 +

      t1 + String.format("public static %s generate() {", jaxWrapperClassName) + n1 +
      t2 + String.format("return new %s(JaxUUID.generate());", jaxWrapperClassName) + n1 +
      t1 + "}" + n1 +
      t0 + "}" + n1
    ;

    Files.writeString(jaxWrapperFilePath, fileContent, StandardOpenOption.CREATE_NEW);
    System.out.println(String.format("Generated Jax Wrapper [%s]", jaxWrapperClassName));
  }
}
