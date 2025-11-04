package com.example.lynx.app.postgres.configuration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.CustomConversions.StoreConversions;
import org.springframework.data.r2dbc.convert.R2dbcCustomConversions;
import org.springframework.data.r2dbc.dialect.PostgresDialect;

import com.example.lynx.app.postgres.converters.JaxConverterHashedSessionTokenValue;
import com.example.lynx.app.postgres.converters.JaxConverterSessionId;
import com.example.lynx.app.postgres.converters.JaxConverterSessionName;
import com.example.lynx.app.postgres.converters.JaxConverterSessionTokenId;

@Configuration
public class JaxConfigurationR2DBC
{
  @Bean
  public R2dbcCustomConversions r2dbcCustomConversions() {
    List<Converter<?, ?>> converters = List.of(
      new JaxConverterSessionId.Reading(),
      new JaxConverterSessionId.Writing(),
      new JaxConverterSessionName.Reading(),
      new JaxConverterSessionName.Writing(),
      new JaxConverterSessionTokenId.Reading(),
      new JaxConverterSessionTokenId.Writing(),
      new JaxConverterHashedSessionTokenValue.Reading(),
      new JaxConverterHashedSessionTokenValue.Writing()
    );
    return new R2dbcCustomConversions(
      StoreConversions.of(PostgresDialect.INSTANCE.getSimpleTypeHolder(), converters),
      converters
    );
  }
}
