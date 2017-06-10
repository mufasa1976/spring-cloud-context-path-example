package io.github.mufasa1976.spring.cloud.example2.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableWebMvc
public class ServerBootApplication extends WebMvcConfigurerAdapter {

  public static void main(String... args) {
    new SpringApplicationBuilder(ServerBootApplication.class)
        .run(args);
  }

}
