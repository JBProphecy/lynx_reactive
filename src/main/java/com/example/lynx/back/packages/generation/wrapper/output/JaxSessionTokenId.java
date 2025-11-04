package com.example.lynx.back.packages.generation.wrapper.output;

import java.util.UUID;

import com.example.lynx.core.c.utility.types.JaxUUID;
import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxSessionTokenId extends JaxWrapper<UUID>
{
  private JaxSessionTokenId(UUID input) { super(input); }

  public static JaxSessionTokenId require(JaxSessionTokenId wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxSessionTokenId.class);
  }

  public static JaxSessionTokenId assign(UUID value) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxSessionTokenId::new);
  }

  public static JaxSessionTokenId assign(UUID value, boolean required) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxSessionTokenId::new, required);
  }

  public static UUID extract(JaxSessionTokenId wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxSessionTokenId.class);
  }

  public static UUID extract(JaxSessionTokenId wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxSessionTokenId.class, required);
  }

  public static JaxSessionTokenId generate() {
    return new JaxSessionTokenId(JaxUUID.generate());
  }
}
