package com.example.lynx.back.packages.generation.wrapper.output;

import java.util.UUID;

import com.example.lynx.core.c.utility.types.JaxUUID;
import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxAccountSessionId extends JaxWrapper<UUID>
{
  private JaxAccountSessionId(UUID input) { super(input); }

  public static JaxAccountSessionId require(JaxAccountSessionId wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxAccountSessionId.class);
  }

  public static JaxAccountSessionId assign(UUID value) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxAccountSessionId::new);
  }

  public static JaxAccountSessionId assign(UUID value, boolean required) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxAccountSessionId::new, required);
  }

  public static UUID extract(JaxAccountSessionId wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxAccountSessionId.class);
  }

  public static UUID extract(JaxAccountSessionId wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxAccountSessionId.class, required);
  }

  public static JaxAccountSessionId generate() {
    return new JaxAccountSessionId(JaxUUID.generate());
  }
}
