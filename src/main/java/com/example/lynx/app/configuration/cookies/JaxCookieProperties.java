package com.example.lynx.app.configuration.cookies;

import java.time.Duration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

import com.example.lynx.app.packages.cookie.JaxCookieName;
import com.example.lynx.app.packages.cookie.JaxSameSitePolicy;
import com.example.lynx.core.c.utility.types.JaxEntity;
import com.example.lynx.core.d.utilities.JaxToStringUtility;

public abstract class JaxCookieProperties
{
  private final JaxCookieName name;
  private final String path;
  private final String domain;
  private final Duration maxAge;
  private final Boolean secure;
  private final Boolean httpOnly;
  private final JaxSameSitePolicy sameSite;

  protected JaxCookieProperties(
    String name,
    String path,
    String domain,
    Duration maxAge,
    Boolean secure,
    Boolean httpOnly,
    JaxSameSitePolicy sameSite
  ) {
    this.name = JaxCookieName.assign(name);
    this.path = path;
    this.domain = domain;
    this.maxAge = maxAge;
    this.secure = secure;
    this.httpOnly = httpOnly;
    this.sameSite = sameSite;
  }

  public JaxCookieName getName() { return this.name; }
  public String getPath() { return this.path; }
  public String getDomain() { return this.domain; }
  public Duration getMaxAge() { return this.maxAge; }
  public Boolean getSecure() { return this.secure; }
  public Boolean getHttpOnly() { return this.httpOnly; }
  public JaxSameSitePolicy getSameSite() { return this.sameSite; }

  @Override
  public String toString() {
    final String name = JaxToStringUtility.buildAttribute("name", this.name);
    final String path = JaxToStringUtility.buildAttribute("path", this.path);
    final String domain = JaxToStringUtility.buildAttribute("domain", this.domain);
    final String maxAge = JaxToStringUtility.buildAttribute("maxAge", this.maxAge);
    final String secure = JaxToStringUtility.buildAttribute("secure", this.secure);
    final String httpOnly = JaxToStringUtility.buildAttribute("httpOnly", this.httpOnly);
    final String sameSite = JaxToStringUtility.buildAttribute("sameSite", this.sameSite);
    return JaxToStringUtility.buildClassString(this.getClass(), name, path, domain, maxAge, secure, httpOnly, sameSite);
  }

  public static JaxCookieProperties require(JaxCookieProperties input) {
    return JaxEntity.require(input, JaxCookieProperties.class);
  }

  @ConfigurationProperties(prefix = "cookies.account-refresh-token")
  public static final class AccountRefreshTokenCookieProperties extends JaxCookieProperties {
    @ConstructorBinding // seems to work without this, but it works with it too...
    private AccountRefreshTokenCookieProperties(
      String name,
      String path,
      String domain,
      Duration maxAge,
      Boolean secure,
      Boolean httpOnly,
      JaxSameSitePolicy sameSite
    ) {
      super(name, path, domain, maxAge, secure, httpOnly, sameSite);
    }
  }

  @ConfigurationProperties(prefix = "cookies.profile-refresh-token")
  public static final class ProfileRefreshTokenCookieProperties extends JaxCookieProperties {
    @ConstructorBinding // seems to work without this, but it works with it too...
    private ProfileRefreshTokenCookieProperties(
      String name,
      String path,
      String domain,
      Duration maxAge,
      Boolean secure,
      Boolean httpOnly,
      JaxSameSitePolicy sameSite
    ) {
      super(name, path, domain, maxAge, secure, httpOnly, sameSite);
    }
  }

  @ConfigurationProperties(prefix = "cookies.session-token")
  public static final class SessionTokenCookieProperties extends JaxCookieProperties {
    @ConstructorBinding // seems to work without this, but it works with it too...
    private SessionTokenCookieProperties(
      String name,
      String path,
      String domain,
      Duration maxAge,
      Boolean secure,
      Boolean httpOnly,
      JaxSameSitePolicy sameSite
    ) {
      super(name, path, domain, maxAge, secure, httpOnly, sameSite);
    }
  }
}
