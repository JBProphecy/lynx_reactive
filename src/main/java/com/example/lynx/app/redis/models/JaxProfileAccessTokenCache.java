package com.example.lynx.app.redis.models;

import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileId;
import com.example.lynx.core.d.utilities.JaxToStringUtility;

public final class JaxProfileAccessTokenCache
{
  private final JaxProfileId profileId;

  public JaxProfileAccessTokenCache(JaxProfileId profileId) {
    this.profileId = profileId;
  }

  public JaxProfileId getProfileId() { return this.profileId; }

  @Override
  public String toString() {
    final String profileId = JaxToStringUtility.buildAttribute("profileId", this.profileId);
    return JaxToStringUtility.buildClassString(this.getClass(), profileId);
  }
}
