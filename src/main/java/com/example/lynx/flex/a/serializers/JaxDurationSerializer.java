package com.example.lynx.flex.a.serializers;

import java.io.IOException;
import java.time.Duration;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public final class JaxDurationSerializer extends StdSerializer<Duration>
{
  public JaxDurationSerializer() { super(Duration.class); }

  @Override
  public void serialize(Duration value, JsonGenerator generator, SerializerProvider provider) throws IOException {
    if (value == null) { generator.writeNull(); }
    generator.writeNumber(value.toMillis());
  }
}
