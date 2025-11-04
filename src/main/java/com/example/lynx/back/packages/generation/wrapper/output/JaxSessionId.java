package com.example.lynx.back.packages.generation.wrapper.output;

import java.util.UUID;

import com.example.lynx.core.c.utility.types.JaxUUID;
import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxSessionId extends JaxWrapper<UUID>
{
  private JaxSessionId(UUID input) { super(input); }

  public static JaxSessionId require(JaxSessionId wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxSessionId.class);
  }

  public static JaxSessionId assign(UUID value) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxSessionId::new);
  }

  public static JaxSessionId assign(UUID value, boolean required) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxSessionId::new, required);
  }

  public static UUID extract(JaxSessionId wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxSessionId.class);
  }

  public static UUID extract(JaxSessionId wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxSessionId.class, required);
  }

  public static JaxSessionId generate() {
    return new JaxSessionId(JaxUUID.generate());
  }
}
