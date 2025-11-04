package com.example.lynx.core.c2.configuration.c0;

import java.time.Duration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

import com.example.lynx.core.c1.utilities.u0.types.t1.JaxDuration;
import com.example.lynx.core.c1.utilities.u1.JaxToStringUtility;

public abstract class JaxTokenProperties
{
  private final Duration duration;

  protected JaxTokenProperties(Duration duration) {
    this.duration = JaxDuration.require(duration);
  }

  public Duration getDuration() { return this.duration; }

  @Override
  public String toString() {
    final String duration = JaxToStringUtility.buildAttribute("duration", this.duration);
    return JaxToStringUtility.buildClassString(this.getClass(), duration);
  }

  @ConfigurationProperties(prefix = "tokens.account-access-token")
  public static final class JaxAccountAccessTokenProperties extends JaxTokenProperties {
    @ConstructorBinding
    public JaxAccountAccessTokenProperties(Duration duration) {
      super(duration);
    }
  }

  @ConfigurationProperties(prefix = "tokens.account-refresh-token")
  public static final class JaxAccountRefreshTokenProperties extends JaxTokenProperties {
    @ConstructorBinding
    public JaxAccountRefreshTokenProperties(Duration duration) {
      super(duration);
    }
  }

  @ConfigurationProperties(prefix = "tokens.profile-access-token")
  public static final class JaxProfileAccessTokenProperties extends JaxTokenProperties {
    @ConstructorBinding
    public JaxProfileAccessTokenProperties(Duration duration) {
      super(duration);
    }
  }

  @ConfigurationProperties(prefix = "tokens.profile-refresh-token")
  public static final class JaxProfileRefreshTokenProperties extends JaxTokenProperties {
    @ConstructorBinding
    public JaxProfileRefreshTokenProperties(Duration duration) {
      super(duration);
    }
  }

  @ConfigurationProperties(prefix = "tokens.session-token")
  public static final class JaxSessionTokenProperties extends JaxTokenProperties {
    @ConstructorBinding
    public JaxSessionTokenProperties(Duration duration) {
      super(duration);
    }
  }
}
