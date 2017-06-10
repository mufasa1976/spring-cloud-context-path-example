package io.github.mufasa1976.spring.cloud.example2.server.service;

import io.github.mufasa1976.spring.cloud.example2.common.Hero;

import java.util.List;
import java.util.Optional;

public interface HeroService {
  List<Hero> findAll();
  Optional<Hero> findByReference(String reference);
}
