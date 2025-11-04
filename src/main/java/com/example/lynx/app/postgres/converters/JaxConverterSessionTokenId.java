package com.example.lynx.app.postgres.converters;

import java.util.UUID;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;

import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionTokenId;
import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxConverterSessionTokenId
{
  private JaxConverterSessionTokenId() { throw JaxForbiddenConstructorException.create(JaxConverterSessionTokenId.class); }

  @ReadingConverter
  public static final class Reading implements Converter<UUID, JaxSessionTokenId>
  {
    @Override
    public JaxSessionTokenId convert(UUID source) {
      return JaxSessionTokenId.assign(source);
    }
  }

  @WritingConverter
  public static final class Writing implements Converter<JaxSessionTokenId, UUID>
  {
    @Override
    public UUID convert(JaxSessionTokenId source) {
      return source.extract();
    }
  }
}
