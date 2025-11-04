package com.example.lynx.app.postgres.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;

import com.example.lynx.back.packages.generation.wrapper.output.JaxSessionName;
import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxConverterSessionName
{
  private JaxConverterSessionName() { throw JaxForbiddenConstructorException.create(JaxConverterSessionName.class); }

  @ReadingConverter
  public static final class Reading implements Converter<String, JaxSessionName>
  {
    @Override
    public JaxSessionName convert(String source) {
      return JaxSessionName.assign(source);
    }
  }

  @WritingConverter
  public static final class Writing implements Converter<JaxSessionName, String>
  {
    @Override
    public String convert(JaxSessionName source) {
      return source.extract();
    }
  }
}
