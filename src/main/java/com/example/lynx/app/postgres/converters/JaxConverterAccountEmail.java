package com.example.lynx.app.postgres.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;

import com.example.lynx.app.wrapper.email.JaxAccountEmail;
import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxConverterAccountEmail
{
  private JaxConverterAccountEmail() { throw JaxForbiddenConstructorException.create(JaxConverterAccountEmail.class); }

  @ReadingConverter
  public static final class Reading implements Converter<String, JaxAccountEmail>
  {
    @Override
    public JaxAccountEmail convert(String source) {
      return JaxAccountEmail.assign(source);
    }
  }

  @WritingConverter
  public static final class Writing implements Converter<JaxAccountEmail, String>
  {
    @Override
    public String convert(JaxAccountEmail source) {
      return source.extract();
    }
  }
}
