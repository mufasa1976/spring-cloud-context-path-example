package io.github.mufasa1976.spring.cloud.example2.server.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.annotation.PostConstruct;

import io.github.mufasa1976.spring.cloud.example2.common.Skill;
import io.github.mufasa1976.spring.cloud.example2.server.service.HeroService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import io.github.mufasa1976.spring.cloud.example2.common.Hero;

@Service
public class HeroServiceImpl implements HeroService {

  private final List<Hero> heroes = new ArrayList<>();

  @PostConstruct
  void initialize() {
    heroes.add(Hero.builder()
        .reference(createReference())
        .name("Superman")
        .skill(Skill.FLY)
        .skill(Skill.JUMP)
        .build());
    heroes.add(Hero.builder()
        .reference(createReference())
        .name("Deadshot")
        .skill(Skill.SHOOT)
        .build());
    heroes.add(Hero.builder()
        .reference(createReference())
        .name("Aquaman")
        .skill(Skill.DIVE)
        .build());
  }

  private String createReference() {
    return UUID.randomUUID().toString();
  }

  public List<Hero> findAll() {
    return heroes;
  }

  public Optional<Hero> findByReference(String reference) {
    return heroes.stream()
        .filter(hero -> StringUtils.equals(hero.getReference(), reference))
        .findAny();
  }
}
