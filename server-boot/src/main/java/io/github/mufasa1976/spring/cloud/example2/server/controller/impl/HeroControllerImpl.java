package io.github.mufasa1976.spring.cloud.example2.server.controller.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.github.mufasa1976.spring.cloud.example2.common.Hero;
import io.github.mufasa1976.spring.cloud.example2.server.controller.HeroController;
import io.github.mufasa1976.spring.cloud.example2.server.service.HeroService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HeroControllerImpl implements HeroController {

  private final HeroService heroService;

  @Override
  public List<Hero> findAll() {
    return heroService.findAll();
  }

  @Override
  public ResponseEntity<Hero> findByReference(@PathVariable String reference) {
    return heroService.findByReference(reference)
        .map(ResponseEntity::ok)
        .orElseGet(ResponseEntity.notFound()::build);
  }

}
