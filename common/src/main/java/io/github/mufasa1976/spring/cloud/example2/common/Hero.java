package io.github.mufasa1976.spring.cloud.example2.common;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;

@Value
@AllArgsConstructor(onConstructor = @__(@JsonCreator))
@Builder
public class Hero {
  private String reference;
  private String name;
  @Singular
  private Set<Skill> skills;
}
