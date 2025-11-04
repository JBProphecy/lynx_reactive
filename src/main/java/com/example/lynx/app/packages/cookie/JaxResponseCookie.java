package com.example.lynx.app.packages.cookie;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import com.example.lynx.app.configuration.cookies.JaxCookieProperties;
import com.example.lynx.core.c.utility.types.JaxEntity;
import com.example.lynx.core.c.utility.types.JaxString;
import com.example.lynx.core.d.utilities.JaxToStringUtility;
import com.example.lynx.flex.a.annotations.MaybeNull;
import com.example.lynx.flex.a.annotations.NeverNull;

public class JaxResponseCookie
{
  @NeverNull
  protected final JaxCookieName name;

  @NeverNull
  protected final String value;

  @MaybeNull
  protected final String path;

  @MaybeNull
  protected final String domain;

  @MaybeNull
  protected final Duration maxAge;

  @MaybeNull
  protected final Boolean secure;

  @MaybeNull
  protected final Boolean httpOnly;

  @MaybeNull
  protected final JaxSameSitePolicy sameSite;

  public JaxResponseCookie(JaxCookieName name, String value, String path, String domain, Duration maxAge, Boolean secure, Boolean httpOnly, JaxSameSitePolicy sameSite) {
    this.name = JaxCookieName.require(name);
    this.value = JaxString.require(value);
    this.path = path;
    this.domain = domain;
    this.maxAge = maxAge;
    this.secure = secure;
    this.httpOnly = httpOnly;
    this.sameSite = sameSite;
  }

  public JaxCookieName getName() { return this.name; }
  public String getValue() { return this.value; }
  public String getPath() { return this.path; }
  public String getDomain() { return this.domain; }
  public Duration getMaxAge() { return this.maxAge; }
  public Boolean getSecure() { return this.secure; }
  public Boolean getHttpOnly() { return this.httpOnly; }
  public JaxSameSitePolicy getSameSite() { return this.sameSite; }

  @Override
  public final String toString() {
		final String name = JaxToStringUtility.buildAttribute("name", this.name);
		final String value = JaxToStringUtility.buildAttribute("value", JaxString.REDACTED);
    final String path = JaxToStringUtility.buildAttribute("path", this.path);
    final String domain = JaxToStringUtility.buildAttribute("domain", this.domain);
    final String maxAge = JaxToStringUtility.buildAttribute("maxAge", this.maxAge);
    final String secure = JaxToStringUtility.buildAttribute("secure", this.secure);
    final String httpOnly = JaxToStringUtility.buildAttribute("httpOnly", this.httpOnly);
    final String sameSite = JaxToStringUtility.buildAttribute("sameSite", this.sameSite);
		return JaxToStringUtility.buildClassString(this.getClass(), name, value, path, domain, maxAge, secure, httpOnly, sameSite);
  }

  public final String toSetCookieHeaderValueString() {
    List<String> attributes = new ArrayList<String>();
    attributes.add(this.name + "=" + this.value);
    if (this.path != null) { attributes.add("Path=" + this.path); }
    if (this.domain != null) { attributes.add("Domain=" + this.domain); }
    if (this.maxAge != null) { attributes.add("Max-Age=" + this.maxAge.toSeconds()); }
    if (this.secure != null) { attributes.add("Secure"); }
    if (this.httpOnly != null) { attributes.add("HttpOnly"); }
    if (this.sameSite != null) { attributes.add("SameSite=" + this.sameSite.getFormattedString()); }
    return JaxString.join("; ", attributes) + ";";
  }

  public final JaxResponseCookie sanitize() {
    return new JaxResponseCookie(
      name,
      JaxString.REDACTED,
      path,
      domain,
      maxAge,
      secure,
      httpOnly,
      sameSite
    );
  }

  public static JaxResponseCookie require(JaxResponseCookie input) {
    return JaxEntity.require(input, JaxResponseCookie.class);
  }

  public static JaxResponseCookie build(JaxCookieProperties properties, String value) {
    JaxCookieProperties.require(properties);
    return new JaxResponseCookie(
      properties.getName(),
      JaxString.require(value),
      properties.getPath(),
      properties.getDomain(),
      properties.getMaxAge(),
      properties.getSecure(),
      properties.getHttpOnly(),
      properties.getSameSite()
    );
  }

  public static JaxResponseCookie build(JaxCookieProperties properties) {
    JaxCookieProperties.require(properties);
    return new JaxResponseCookie(
      properties.getName(),
      JaxString.EMPTY,
      properties.getPath(),
      properties.getDomain(),
      Duration.ZERO,
      properties.getSecure(),
      properties.getHttpOnly(),
      properties.getSameSite()
    );
  }
}
