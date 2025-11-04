package com.example.lynx.back.packages.generation.wrapper.d;

import com.example.lynx.back.packages.generation.wrapper.a.JaxWrappedTypeVariant;
import com.example.lynx.back.packages.generation.wrapper.b.JaxWrapperDefinition;
import com.example.lynx.back.packages.generation.wrapper.c.JaxWrapperDefinitions;
import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxWrapperConfiguration
{
  private JaxWrapperConfiguration() { throw JaxForbiddenConstructorException.create(JaxWrapperConfiguration.class); }
  
  public static final JaxWrapperDefinitions DEFINITIONS = new JaxWrapperDefinitions(
    new JaxWrapperDefinition("JaxAccountEmail", JaxWrappedTypeVariant.STRING, true),
    new JaxWrapperDefinition("JaxAccountId", JaxWrappedTypeVariant.UUID, true),
    new JaxWrapperDefinition("JaxAccountName", JaxWrappedTypeVariant.STRING, true),
    new JaxWrapperDefinition("JaxAccountRefreshTokenId", JaxWrappedTypeVariant.UUID, true),
    new JaxWrapperDefinition("JaxAccountSessionId", JaxWrappedTypeVariant.UUID, true),
    new JaxWrapperDefinition("JaxHashedAccountRefreshTokenValue", JaxWrappedTypeVariant.STRING, true),
    new JaxWrapperDefinition("JaxHashedProfileRefreshTokenValue", JaxWrappedTypeVariant.STRING, true),
    new JaxWrapperDefinition("JaxHashedSessionTokenValue", JaxWrappedTypeVariant.STRING, true),
    new JaxWrapperDefinition("JaxProfileId", JaxWrappedTypeVariant.UUID, true),
    new JaxWrapperDefinition("JaxProfileName", JaxWrappedTypeVariant.STRING, true),
    new JaxWrapperDefinition("JaxProfileRefreshTokenId", JaxWrappedTypeVariant.UUID, true),
    new JaxWrapperDefinition("JaxProfileSessionId", JaxWrappedTypeVariant.UUID, true),
    new JaxWrapperDefinition("JaxProfileUsername", JaxWrappedTypeVariant.STRING, true),
    new JaxWrapperDefinition("JaxSessionId", JaxWrappedTypeVariant.UUID, true),
    new JaxWrapperDefinition("JaxSessionName", JaxWrappedTypeVariant.STRING, true),
    new JaxWrapperDefinition("JaxSessionTokenId", JaxWrappedTypeVariant.UUID, true),

    new JaxWrapperDefinition("JaxAccountAccessTokenValue", JaxWrappedTypeVariant.STRING, false),
    new JaxWrapperDefinition("JaxActualAccountRefreshTokenValue", JaxWrappedTypeVariant.STRING, false),
    new JaxWrapperDefinition("JaxActualProfileRefreshTokenValue", JaxWrappedTypeVariant.STRING, false),
    new JaxWrapperDefinition("JaxActualSessionTokenValue", JaxWrappedTypeVariant.STRING, false),
    new JaxWrapperDefinition("JaxEmail", JaxWrappedTypeVariant.STRING, false),
    new JaxWrapperDefinition("JaxEmailVerificationCode", JaxWrappedTypeVariant.STRING, false),
    new JaxWrapperDefinition("JaxEmailVerificationToken", JaxWrappedTypeVariant.STRING, false),
    new JaxWrapperDefinition("JaxProfileAccessTokenValue", JaxWrappedTypeVariant.STRING, false)
  );
}
