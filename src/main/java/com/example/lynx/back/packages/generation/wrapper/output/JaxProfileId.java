package com.example.lynx.back.packages.generation.wrapper.output;

import java.util.UUID;

import com.example.lynx.core.c.utility.types.JaxUUID;
import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxProfileId extends JaxWrapper<UUID>
{
  private JaxProfileId(UUID input) { super(input); }

  public static JaxProfileId require(JaxProfileId wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxProfileId.class);
  }

  public static JaxProfileId assign(UUID value) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxProfileId::new);
  }

  public static JaxProfileId assign(UUID value, boolean required) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxProfileId::new, required);
  }

  public static UUID extract(JaxProfileId wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxProfileId.class);
  }

  public static UUID extract(JaxProfileId wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxProfileId.class, required);
  }

  public static JaxProfileId generate() {
    return new JaxProfileId(JaxUUID.generate());
  }
}
