package com.example.lynx.app.redis.models;

import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountId;
import com.example.lynx.core.d.utilities.JaxToStringUtility;

public final class JaxAccountAccessTokenCache
{
  private final JaxAccountId accountId;

  public JaxAccountAccessTokenCache(JaxAccountId accountId) {
    this.accountId = accountId;
  }

  public JaxAccountId getAccountId() { return this.accountId; }

  @Override
  public String toString() {
    final String accountId = JaxToStringUtility.buildAttribute("accountId", this.accountId);
    return JaxToStringUtility.buildClassString(this.getClass(), accountId);
  }
}
