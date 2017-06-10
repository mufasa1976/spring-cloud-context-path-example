package io.github.mufasa1976.spring.cloud.example2.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableWebMvc
public class ClientBootApplication extends WebMvcConfigurerAdapter {

  public static void main(String... args) {
    new SpringApplicationBuilder(ClientBootApplication.class)
        .run(args);
  }

}
