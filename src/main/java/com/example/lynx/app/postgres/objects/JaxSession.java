package com.example.lynx.app.postgres.objects;

import java.time.OffsetDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionId;
import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionName;
import com.example.lynx.core.c.utility.types.JaxEntity;
import com.example.lynx.core.d.utilities.JaxToStringUtility;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table("sessions")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class JaxSession
{
  @Id
  @Column("id")
  private JaxSessionId id;

  @Column("name")
  private JaxSessionName name;

  @Column("created")
  private OffsetDateTime created;

  @Column("updated")
  private OffsetDateTime updated;

  public static JaxSession create() {
    final JaxSessionId id = JaxSessionId.generate();
    final JaxSessionName name = JaxSessionName.assign("Unknown Device");
    final OffsetDateTime created = OffsetDateTime.now();
    final OffsetDateTime updated = created;
    return new JaxSession(id, name, created, updated);
  }

  @Override
  public String toString() {
    final String id = JaxToStringUtility.buildAttribute("id", this.id);
    final String name = JaxToStringUtility.buildAttribute("name", this.name);
    final String created = JaxToStringUtility.buildAttribute("created", this.created);
    final String updated = JaxToStringUtility.buildAttribute("updated", this.updated);
    return JaxToStringUtility.buildClassString(this.getClass(), id, name, created, updated);
  }

  public static JaxSession require(JaxSession object) {
    return JaxEntity.require(object, JaxSession.class);
  }
}
