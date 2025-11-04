package com.example.lynx.back.packages.generation.wrapper.b;

import java.nio.file.Path;

import com.example.lynx.back.packages.generation.wrapper.a.JaxWrappedTypeVariant;
import com.example.lynx.back.packages.generation.wrapper.a.JaxWrapperConstants;
import com.example.lynx.core.d.utilities.JaxToStringUtility;
import com.example.lynx.flex.a.utilities.JaxPathUtils;

public final class JaxWrapperDefinition
{
  private static final String JAX_WRAPPER_PACKAGE = JaxWrapperConstants.JAX_WRAPPER_PACKAGE;
  private static final String JAX_JAVA_TYPE_PACKAGE = JaxWrapperConstants.JAX_JAVA_TYPE_PACKAGE;
  private static final Path JAX_WRAPPER_DIRECTORY = JaxWrapperConstants.JAX_WRAPPER_DIRECTORY;
  private static final Path JAX_JAVA_TYPE_DIRECTORY = JaxWrapperConstants.JAX_JAVA_TYPE_DIRECTORY;

  private final JaxWrappedTypeVariant wrappedType;
  private final boolean generateJavaType;
  private final String jaxWrapperClassName;
  private final String jaxJavaTypeClassName;
  private final String jaxWrapperFullyQualifiedClassName;
  private final String jaxJavaTypeFullQualifiedClassName;
  private final Path jaxWrapperFilePath;
  private final Path jaxJavaTypeFilePath;

  public JaxWrapperDefinition(String wrapperName, JaxWrappedTypeVariant wrappedType, boolean generateJavaType) {
    final String jaxWrapperClassName = wrapperName;
    final String jaxJavaTypeClassName = "JaxJavaType" + wrapperName;
    this.wrappedType = wrappedType;
    this.generateJavaType = generateJavaType;
    this.jaxWrapperClassName = jaxWrapperClassName;
    this.jaxJavaTypeClassName = jaxJavaTypeClassName;
    this.jaxWrapperFullyQualifiedClassName = JaxPathUtils.buildFullyQualifiedClassName(JAX_WRAPPER_PACKAGE, jaxWrapperClassName);
    this.jaxJavaTypeFullQualifiedClassName = JaxPathUtils.buildFullyQualifiedClassName(JAX_JAVA_TYPE_PACKAGE, jaxJavaTypeClassName);
    this.jaxWrapperFilePath = JaxPathUtils.buildFilePathJava(JAX_WRAPPER_DIRECTORY, jaxWrapperClassName);
    this.jaxJavaTypeFilePath = JaxPathUtils.buildFilePathJava(JAX_JAVA_TYPE_DIRECTORY, jaxJavaTypeClassName);
  }

  public JaxWrappedTypeVariant getWrappedType() { return this.wrappedType; }
  public boolean getGenerateJavaType() { return this.generateJavaType; }
  public String getJaxWrapperClassName() { return this.jaxWrapperClassName; }
  public String getJaxJavaTypeClassName() { return this.jaxJavaTypeClassName; }
  public String getJaxWrapperFullyQualifiedClassName() { return this.jaxWrapperFullyQualifiedClassName; }
  public String getJaxJavaTypeFullyQualifiedClassName() { return this.jaxJavaTypeFullQualifiedClassName; }
  public Path getJaxWrapperFilePath() { return this.jaxWrapperFilePath; }
  public Path getJaxJavaTypeFilePath() { return this.jaxJavaTypeFilePath; }

  @Override
  public String toString() {
    final String jaxWrapperClassName = JaxToStringUtility.buildAttribute("jaxJavaTypeClassName", this.jaxWrapperClassName);
    return JaxToStringUtility.buildClassString(this.getClass(), jaxWrapperClassName);
  }
}
