package io.github.mufasa1976.spring.cloud.example2.server;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.mufasa1976.spring.cloud.example2.common.Hero;
import io.github.mufasa1976.spring.cloud.example2.common.Routes;

public interface HeroController {

  @GetMapping(Routes.HEROES)
  List<Hero> findAll();

  @GetMapping(Routes.HERO)
  ResponseEntity<Hero> findByReference(@PathVariable(Routes.Param.REFERENCE) String reference);

}
