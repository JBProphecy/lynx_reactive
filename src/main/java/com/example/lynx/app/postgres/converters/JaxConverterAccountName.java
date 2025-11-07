package com.example.lynx.app.postgres.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;

import com.example.lynx.back.packages.generation.wrapper.output.JaxAccountName;
import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxConverterAccountName
{
  private JaxConverterAccountName() { throw JaxForbiddenConstructorException.create(JaxConverterAccountName.class); }

  @ReadingConverter
  public static final class Reading implements Converter<String, JaxAccountName>
  {
    @Override
    public JaxAccountName convert(String source) {
      return JaxAccountName.assign(source);
    }
  }

  @WritingConverter
  public static final class Writing implements Converter<JaxAccountName, String>
  {
    @Override
    public String convert(JaxAccountName source) {
      return source.extract();
    }
  }
}
