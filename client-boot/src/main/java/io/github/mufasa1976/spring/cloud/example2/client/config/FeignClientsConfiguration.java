package io.github.mufasa1976.spring.cloud.example2.client.config;

import feign.Logger;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(FeignClientsConfiguration.Properties.class)
public class FeignClientsConfiguration {

  @ConfigurationProperties(prefix = "feign")
  @Data
  static class Properties {
    private Logger.Level logLevel = Logger.Level.NONE;
  }

  @Bean
  public Logger.Level logLevel(Properties properties) {
    return properties.getLogLevel();
  }

}
