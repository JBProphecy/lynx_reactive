package com.example.lynx.back.packages.generation.wrapper.output;

import java.util.UUID;

import com.example.lynx.core.c.utility.types.JaxUUID;
import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxAccountId extends JaxWrapper<UUID>
{
  private JaxAccountId(UUID input) { super(input); }

  public static JaxAccountId require(JaxAccountId wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxAccountId.class);
  }

  public static JaxAccountId assign(UUID value) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxAccountId::new);
  }

  public static JaxAccountId assign(UUID value, boolean required) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxAccountId::new, required);
  }

  public static UUID extract(JaxAccountId wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxAccountId.class);
  }

  public static UUID extract(JaxAccountId wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxAccountId.class, required);
  }

  public static JaxAccountId generate() {
    return new JaxAccountId(JaxUUID.generate());
  }
}
