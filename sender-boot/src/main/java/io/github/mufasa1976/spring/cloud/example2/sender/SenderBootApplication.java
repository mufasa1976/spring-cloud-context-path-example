package io.github.mufasa1976.spring.cloud.example2.sender;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableWebMvc
public class SenderBootApplication extends WebMvcConfigurerAdapter {

  public static void main(String... args) {
    new SpringApplicationBuilder(SenderBootApplication.class)
        .run(args);
  }

}
