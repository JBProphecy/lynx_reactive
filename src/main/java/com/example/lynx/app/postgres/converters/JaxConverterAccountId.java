package com.example.lynx.app.postgres.converters;

import java.util.UUID;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;

import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountId;
import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxConverterAccountId
{
  private JaxConverterAccountId() { throw JaxForbiddenConstructorException.create(JaxConverterAccountId.class); }

  @ReadingConverter
  public static final class Reading implements Converter<UUID, JaxAccountId>
  {
    @Override
    public JaxAccountId convert(UUID source) {
      return JaxAccountId.assign(source);
    }
  }

  @WritingConverter
  public static final class Writing implements Converter<JaxAccountId, UUID>
  {
    @Override
    public UUID convert(JaxAccountId source) {
      return source.extract();
    }
  }
}
