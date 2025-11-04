package com.example.lynx.back.packages.generation.wrapper.output;

import java.util.UUID;

import com.example.lynx.core.c.utility.types.JaxUUID;
import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxAccountRefreshTokenId extends JaxWrapper<UUID>
{
  private JaxAccountRefreshTokenId(UUID input) { super(input); }

  public static JaxAccountRefreshTokenId require(JaxAccountRefreshTokenId wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxAccountRefreshTokenId.class);
  }

  public static JaxAccountRefreshTokenId assign(UUID value) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxAccountRefreshTokenId::new);
  }

  public static JaxAccountRefreshTokenId assign(UUID value, boolean required) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxAccountRefreshTokenId::new, required);
  }

  public static UUID extract(JaxAccountRefreshTokenId wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxAccountRefreshTokenId.class);
  }

  public static UUID extract(JaxAccountRefreshTokenId wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxAccountRefreshTokenId.class, required);
  }

  public static JaxAccountRefreshTokenId generate() {
    return new JaxAccountRefreshTokenId(JaxUUID.generate());
  }
}
