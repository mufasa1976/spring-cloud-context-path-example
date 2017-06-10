package io.github.mufasa1976.spring.cloud.example2.receiver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableWebMvc
public class ReceiverBootApplication extends WebMvcConfigurerAdapter {

  public static void main(String... args) {
    new SpringApplicationBuilder(ReceiverBootApplication.class)
        .run(args);
  }

}
