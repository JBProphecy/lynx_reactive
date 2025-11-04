package com.example.lynx.app.postgres.entites;

import java.time.OffsetDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.example.lynx.app.wrapper.password.JaxHashedAccountPassword;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountEmail;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountName;
import com.example.lynx.core.c.utility.types.JaxEntity;
import com.example.lynx.core.c.utility.types.JaxString;
import com.example.lynx.core.d.utilities.JaxToStringUtility;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table("accounts")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
public final class JaxAccount
{
  @Id
  @Column("id")
  private JaxAccountId id;

  @Column("name")
  private JaxAccountName name;

  @Column("email")
  private JaxAccountEmail email;

  @Column("password")
  private JaxHashedAccountPassword password;

  @Column("created")
  private OffsetDateTime created;

  @Column("updated")
  private OffsetDateTime updated;

  @Override
  public String toString() {
    final String id = JaxToStringUtility.buildAttribute("id", this.id);
    final String name = JaxToStringUtility.buildAttribute("name", this.name);
    final String email = JaxToStringUtility.buildAttribute("email", JaxString.REDACTED);
    final String password = JaxToStringUtility.buildAttribute("password", JaxString.REDACTED);
    final String created = JaxToStringUtility.buildAttribute("created", this.created);
    final String updated = JaxToStringUtility.buildAttribute("updated", this.updated);
    return JaxToStringUtility.buildClassString(this.getClass(), id, name, email, password, created, updated);
  }

  public static JaxAccount require(JaxAccount entity) {
    return JaxEntity.require(entity, JaxAccount.class);
  }
}
