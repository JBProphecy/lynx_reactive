package com.example.lynx.back.packages.generation.wrapper.output;

import java.util.UUID;

import com.example.lynx.core.c.utility.types.JaxUUID;
import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxProfileSessionId extends JaxWrapper<UUID>
{
  private JaxProfileSessionId(UUID input) { super(input); }

  public static JaxProfileSessionId require(JaxProfileSessionId wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxProfileSessionId.class);
  }

  public static JaxProfileSessionId assign(UUID value) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxProfileSessionId::new);
  }

  public static JaxProfileSessionId assign(UUID value, boolean required) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxProfileSessionId::new, required);
  }

  public static UUID extract(JaxProfileSessionId wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxProfileSessionId.class);
  }

  public static UUID extract(JaxProfileSessionId wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxProfileSessionId.class, required);
  }

  public static JaxProfileSessionId generate() {
    return new JaxProfileSessionId(JaxUUID.generate());
  }
}
