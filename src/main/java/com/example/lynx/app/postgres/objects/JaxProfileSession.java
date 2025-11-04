package com.example.lynx.app.postgres.objects;

import java.time.OffsetDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxProfileSessionId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionId;
import com.example.lynx.core.c.utility.types.JaxEntity;
import com.example.lynx.core.d.utilities.JaxToStringUtility;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table("profile_sessions")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
public final class JaxProfileSession
{
  @Id
  @Column("id")
  private JaxProfileSessionId id;

  @Column("profile_id")
  private JaxProfileId profileId;

  @Column("session_id")
  private JaxSessionId sessionId;

  @Column("created")
  private OffsetDateTime created;

  @Override
  public String toString() {
    final String id = JaxToStringUtility.buildAttribute("id", this.id);
    final String profileId = JaxToStringUtility.buildAttribute("profileId", this.profileId);
    final String sessionId = JaxToStringUtility.buildAttribute("sessionId", this.sessionId);
    final String created = JaxToStringUtility.buildAttribute("created", this.created);
    return JaxToStringUtility.buildClassString(this.getClass(), id, profileId, sessionId, created);
  }

  public static JaxProfileSession require(JaxProfileSession object) {
    return JaxEntity.require(object, JaxProfileSession.class);
  }
}
