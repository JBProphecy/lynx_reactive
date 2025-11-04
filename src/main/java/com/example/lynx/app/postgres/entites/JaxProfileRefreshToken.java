package com.example.lynx.app.postgres.entites;

import java.time.OffsetDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.example.lynx.back.packages.generation.wrapper.output.JaxHashedProfileRefreshTokenValue;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileRefreshTokenId;
import com.example.lynx.core.c.utility.types.JaxEntity;
import com.example.lynx.core.c.utility.types.JaxString;
import com.example.lynx.core.d.utilities.JaxToStringUtility;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table("profile_refresh_tokens")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
public final class JaxProfileRefreshToken
{
  @Id
  @Column("id")
  private JaxProfileRefreshTokenId id;

  @Column("value")
  private JaxHashedProfileRefreshTokenValue value;

  @Column("created")
  private OffsetDateTime created;

  @Column("updated")
  private OffsetDateTime updated;

  @Column("expires")
  private OffsetDateTime expires;

  @Column("version")
  private short version;

  @Override
  public String toString() {
    final String id = JaxToStringUtility.buildAttribute("id", this.id);
    final String value = JaxToStringUtility.buildAttribute("value", JaxString.REDACTED);
    final String created = JaxToStringUtility.buildAttribute("created", this.created);
    final String updated = JaxToStringUtility.buildAttribute("updated", this.updated);
    final String expires = JaxToStringUtility.buildAttribute("expires", this.expires);
    final String version = JaxToStringUtility.buildAttribute("version", this.version);
    return JaxToStringUtility.buildClassString(this.getClass(), id, value, created, updated, expires, version);
  }

  public static JaxProfileRefreshToken require(JaxProfileRefreshToken entity) {
    return JaxEntity.require(entity, JaxProfileRefreshToken.class);
  }
}
