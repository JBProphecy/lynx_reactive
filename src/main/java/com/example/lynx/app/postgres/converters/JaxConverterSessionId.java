package com.example.lynx.app.postgres.converters;

import java.util.UUID;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;

import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionId;
import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxConverterSessionId
{
  private JaxConverterSessionId() { throw JaxForbiddenConstructorException.create(JaxConverterSessionId.class); }

  @ReadingConverter
  public static final class Reading implements Converter<UUID, JaxSessionId>
  {
    @Override
    public JaxSessionId convert(UUID source) {
      return JaxSessionId.assign(source);
    }
  }

  @WritingConverter
  public static final class Writing implements Converter<JaxSessionId, UUID>
  {
    @Override
    public UUID convert(JaxSessionId source) {
      return source.extract();
    }
  }
}
