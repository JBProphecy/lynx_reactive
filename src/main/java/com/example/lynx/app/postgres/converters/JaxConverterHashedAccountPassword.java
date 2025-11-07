package com.example.lynx.app.postgres.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;

import com.example.lynx.app.wrapper.password.JaxHashedAccountPassword;
import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxConverterHashedAccountPassword
{
  private JaxConverterHashedAccountPassword() { throw JaxForbiddenConstructorException.create(JaxConverterHashedAccountPassword.class); }

  @ReadingConverter
  public static final class Reading implements Converter<String, JaxHashedAccountPassword>
  {
    @Override
    public JaxHashedAccountPassword convert(String source) {
      return JaxHashedAccountPassword.assign(source);
    }
  }

  @WritingConverter
  public static final class Writing implements Converter<JaxHashedAccountPassword, String>
  {
    @Override
    public String convert(JaxHashedAccountPassword source) {
      return source.extract();
    }
  }
}
