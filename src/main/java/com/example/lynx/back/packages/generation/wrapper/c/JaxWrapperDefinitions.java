package com.example.lynx.back.packages.generation.wrapper.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.example.lynx.back.packages.generation.wrapper.b.JaxWrapperDefinition;
import com.example.lynx.core.a.exception.JaxBasicRuntimeException;
import com.example.lynx.core.d.utilities.JaxToStringUtility;
import com.fasterxml.jackson.annotation.JsonValue;

public final class JaxWrapperDefinitions
{
  private final List<JaxWrapperDefinition> definitions;

  public JaxWrapperDefinitions() {
    this.definitions = new ArrayList<>();
  }

  public JaxWrapperDefinitions(Collection<JaxWrapperDefinition> definitions) {
    this.definitions = new ArrayList<>(definitions);
  }

  public JaxWrapperDefinitions(JaxWrapperDefinition... definitions) {
    this.definitions = new ArrayList<>(Arrays.asList(definitions));
  }

  @JsonValue
  public List<JaxWrapperDefinition> extract() {
    return List.copyOf(this.definitions);
  }

  @Override
  public String toString() {
    return JaxToStringUtility.buildClassString(this.getClass(), String.valueOf(this.definitions));
  }

  public boolean register(JaxWrapperDefinition definition) {
    try { return this.definitions.add(definition); }
    catch (Exception exception) {
      throw new JaxBasicRuntimeException(String.format("Error Registering Jax Wrapper Definition [%s]", definition), exception);
    }
  }

  public boolean register(Collection<JaxWrapperDefinition> definitions) {
    try { return this.definitions.addAll(definitions); }
    catch (Exception exception) {
      throw new JaxBasicRuntimeException(String.format("Error Registering Jax Wrapper Definitions [%s]", definitions), exception);
    }
  }

  public boolean register(JaxWrapperDefinition... definitions) {
    return this.register(Arrays.asList(definitions));
  }
}
