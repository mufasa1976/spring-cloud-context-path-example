package io.github.mufasa1976.spring.cloud.example2.client;

import io.github.mufasa1976.spring.cloud.example2.client.config.FeignClientsConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableHystrix
@EnableFeignClients(defaultConfiguration = FeignClientsConfiguration.class)
@EnableWebMvc
public class ClientBootApplication extends WebMvcConfigurerAdapter {

  public static void main(String... args) {
    new SpringApplicationBuilder(ClientBootApplication.class)
        .run(args);
  }

}
