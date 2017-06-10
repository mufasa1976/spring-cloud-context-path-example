package io.github.mufasa1976.spring.cloud.example2.client.controller;

import io.github.mufasa1976.spring.cloud.example2.client.remote.HeroApiFeignClient;
import io.github.mufasa1976.spring.cloud.example2.common.Hero;
import io.github.mufasa1976.spring.cloud.example2.common.Routes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HeroClientController {

  private final HeroApiFeignClient heroApi;

  @GetMapping(Routes.HEROES)
  public List<Hero> findAll() {
    return heroApi.findAll();
  }

  @GetMapping(Routes.HERO)
  public ResponseEntity<Hero> findByReference(@PathVariable(Routes.Param.REFERENCE) String reference) {
    return heroApi.find(reference)
        .map(ResponseEntity::ok)
        .orElseGet(ResponseEntity.notFound()::build);
  }

}
