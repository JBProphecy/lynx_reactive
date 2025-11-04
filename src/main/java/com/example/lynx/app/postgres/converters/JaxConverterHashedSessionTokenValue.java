package com.example.lynx.app.postgres.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;

import com.example.lynx.app.wrapper.opaque.token.value.JaxHashedSessionTokenValue;
import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxConverterHashedSessionTokenValue
{
  private JaxConverterHashedSessionTokenValue() { throw JaxForbiddenConstructorException.create(JaxConverterHashedSessionTokenValue.class); }

  @ReadingConverter
  public static final class Reading implements Converter<String, JaxHashedSessionTokenValue>
  {
    @Override
    public JaxHashedSessionTokenValue convert(String source) {
      return JaxHashedSessionTokenValue.assign(source);
    }
  }

  @WritingConverter
  public static final class Writing implements Converter<JaxHashedSessionTokenValue, String>
  {
    @Override
    public String convert(JaxHashedSessionTokenValue source) {
      return source.extract();
    }
  }
}
