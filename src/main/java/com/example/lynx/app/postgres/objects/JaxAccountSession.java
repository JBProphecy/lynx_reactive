package com.example.lynx.app.postgres.objects;

import java.time.OffsetDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountSessionId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionId;
import com.example.lynx.core.c.utility.types.JaxEntity;
import com.example.lynx.core.d.utilities.JaxToStringUtility;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table("account_sessions")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
public final class JaxAccountSession
{
  @Id
  @Column("id")
  private JaxAccountSessionId id;

  @Column("account_id")
  private JaxAccountId accountId;

  @Column("session_id")
  private JaxSessionId sessionId;

  @Column("created")
  private OffsetDateTime created;

  @Override
  public String toString() {
    final String id = JaxToStringUtility.buildAttribute("id", this.id);
    final String accountId = JaxToStringUtility.buildAttribute("accountId", this.accountId);
    final String sessionId = JaxToStringUtility.buildAttribute("sessionId", this.sessionId);
    final String created = JaxToStringUtility.buildAttribute("created", this.created);
    return JaxToStringUtility.buildClassString(this.getClass(), id, accountId, sessionId, created);
  }

  public static JaxAccountSession require(JaxAccountSession object) {
    return JaxEntity.require(object, JaxAccountSession.class);
  }
}
