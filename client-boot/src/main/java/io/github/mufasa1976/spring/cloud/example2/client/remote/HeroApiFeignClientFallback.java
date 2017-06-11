package io.github.mufasa1976.spring.cloud.example2.client.remote;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import io.github.mufasa1976.spring.cloud.example2.common.Hero;

@Component
public class HeroApiFeignClientFallback implements HeroApiFeignClient {

  private final static Hero FALLBACK_HERO = Hero.builder()
      .reference("000000")
      .name("Fallback Hero")
      .build();
  private final static List<Hero> FALLBACK_HEROES = new ArrayList<>();

  @PostConstruct
  public void initialize() {
    FALLBACK_HEROES.add(FALLBACK_HERO);
  }

  @Override
  public List<Hero> findAll() {
    return FALLBACK_HEROES;
  }

  @Override
  public Hero find(String reference) {
    return FALLBACK_HERO;
  }

}
