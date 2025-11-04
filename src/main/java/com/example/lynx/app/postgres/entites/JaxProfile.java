package com.example.lynx.app.postgres.entites;

import java.time.OffsetDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.example.lynx.app.wrapper.password.JaxHashedProfilePassword;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileName;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileUsername;
import com.example.lynx.core.c.utility.types.JaxEntity;
import com.example.lynx.core.c.utility.types.JaxString;
import com.example.lynx.core.d.utilities.JaxToStringUtility;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table("profiles")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
public final class JaxProfile
{
  @Id
  @Column("id")
  private JaxProfileId id;

  @Column("accountId")
  private JaxAccountId accountId;

  @Column("name")
  private JaxProfileName name;

  @Column("username")
  private JaxProfileUsername username;

  @Column("password")
  private JaxHashedProfilePassword password;

  @Column("created")
  private OffsetDateTime created;

  @Column("updated")
  private OffsetDateTime updated;

  @Override
  public String toString() {
    final String id = JaxToStringUtility.buildAttribute("id", this.id);
    final String accountId = JaxToStringUtility.buildAttribute("accountId", this.accountId);
    final String name = JaxToStringUtility.buildAttribute("name", this.name);
    final String username = JaxToStringUtility.buildAttribute("username", this.username);
    final String password = JaxToStringUtility.buildAttribute("password", JaxString.REDACTED);
    final String created = JaxToStringUtility.buildAttribute("created", this.created);
    final String updated = JaxToStringUtility.buildAttribute("updated", this.updated);
    return JaxToStringUtility.buildClassString(this.getClass(), id, accountId, name, username, password, created, updated);
  }

  public static JaxProfile require(JaxProfile entity) {
    return JaxEntity.require(entity, JaxProfile.class);
  }
}
