package io.github.mufasa1976.spring.cloud.example2.client.remote;

import io.github.mufasa1976.spring.cloud.example2.common.Hero;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class HeroApiFeignClientFallback implements HeroApiFeignClient {

  @Override
  public List<Hero> findAll() {
    return new ArrayList<>();
  }

  @Override
  public Optional<Hero> find(String reference) {
    return Optional.empty();
  }

}
