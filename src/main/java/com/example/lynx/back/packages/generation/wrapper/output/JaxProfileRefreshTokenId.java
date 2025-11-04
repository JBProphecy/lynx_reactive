package com.example.lynx.back.packages.generation.wrapper.output;

import java.util.UUID;

import com.example.lynx.core.c.utility.types.JaxUUID;
import com.example.lynx.core.e.wrapper.JaxWrapper;
import com.example.lynx.core.e.wrapper.JaxWrapperUtils;

public final class JaxProfileRefreshTokenId extends JaxWrapper<UUID>
{
  private JaxProfileRefreshTokenId(UUID input) { super(input); }

  public static JaxProfileRefreshTokenId require(JaxProfileRefreshTokenId wrapper) {
    return JaxWrapperUtils.require(wrapper, JaxProfileRefreshTokenId.class);
  }

  public static JaxProfileRefreshTokenId assign(UUID value) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxProfileRefreshTokenId::new);
  }

  public static JaxProfileRefreshTokenId assign(UUID value, boolean required) {
    return JaxWrapperUtils.assign(value, UUID.class, JaxProfileRefreshTokenId::new, required);
  }

  public static UUID extract(JaxProfileRefreshTokenId wrapper) {
    return JaxWrapperUtils.extract(wrapper, JaxProfileRefreshTokenId.class);
  }

  public static UUID extract(JaxProfileRefreshTokenId wrapper, boolean required) {
    return JaxWrapperUtils.extract(wrapper, JaxProfileRefreshTokenId.class, required);
  }

  public static JaxProfileRefreshTokenId generate() {
    return new JaxProfileRefreshTokenId(JaxUUID.generate());
  }
}
