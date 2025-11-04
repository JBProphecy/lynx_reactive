package com.example.lynx.app.postgres.objects;

import java.time.OffsetDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.example.lynx.back.packages.generation.wrapper.output.JaxHashedSessionTokenValue;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionTokenId;
import com.example.lynx.core.c.utility.types.JaxEntity;
import com.example.lynx.core.c.utility.types.JaxString;
import com.example.lynx.core.d.utilities.JaxToStringUtility;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table("session_tokens")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class JaxSessionToken
{
  @Id
  @Column("id")
  private JaxSessionTokenId id;

  @Column("value")
  private JaxHashedSessionTokenValue value;

  @Column("created")
  private OffsetDateTime created;

  @Column("updated")
  private OffsetDateTime updated;

  @Column("version")
  private int version;

  public static JaxSessionToken create(JaxSessionId sessionId, JaxHashedSessionTokenValue value) {
    final JaxSessionTokenId id = JaxSessionTokenId.assign(JaxSessionId.extract(sessionId));
    final OffsetDateTime created = OffsetDateTime.now();
    final OffsetDateTime updated = created;
    final int version = 1;
    return new JaxSessionToken(id, value, created, updated, version);
  }

  public JaxSessionToken update(JaxHashedSessionTokenValue value) {
    final JaxSessionTokenId id = this.id;
    final OffsetDateTime created = this.created;
    final OffsetDateTime updated = OffsetDateTime.now();
    final int version = this.version + 1;
    return new JaxSessionToken(id, value, created, updated, version);
  }

  @Override
  public String toString() {
    final String id = JaxToStringUtility.buildAttribute("id", this.id);
    final String value = JaxToStringUtility.buildAttribute("value", JaxString.REDACTED);
    final String created = JaxToStringUtility.buildAttribute("created", this.created);
    final String updated = JaxToStringUtility.buildAttribute("updated", this.updated);
    final String version = JaxToStringUtility.buildAttribute("version", this.version);
    return JaxToStringUtility.buildClassString(this.getClass(), id, value, created, updated, version);
  }

  public static JaxSessionToken require(JaxSessionToken object) {
    return JaxEntity.require(object, JaxSessionToken.class);
  }
}
