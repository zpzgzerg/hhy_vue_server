package xyz.zpzgzerg.hhy.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class DbConfig {

  @Bean(name="dataSource")
  public DataSource dataSource() {
    EmbeddedDatabaseBuilder embeddedDatabaseBuilder = new EmbeddedDatabaseBuilder();
    DataSource dataSource = embeddedDatabaseBuilder
      .addScript("classpath:schema/schema.sql")
      .setType(EmbeddedDatabaseType.H2)
      .build();

    return dataSource;
  }

}
