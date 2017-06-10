package io.github.mufasa1976.spring.cloud.example2.common;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface HeroApi {

  @RequestMapping(Routes.HEROES)
  List<Hero> findAll();

  @RequestMapping(Routes.HERO)
  Hero find(@PathVariable(Routes.Param.REFERENCE) String reference);

}
