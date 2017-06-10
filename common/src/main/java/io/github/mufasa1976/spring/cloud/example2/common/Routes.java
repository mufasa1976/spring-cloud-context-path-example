package io.github.mufasa1976.spring.cloud.example2.common;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Routes {

  @NoArgsConstructor(access = AccessLevel.PRIVATE)
  public final static class Param {
    public final static String REFERENCE = "reference";
  }

  private final static class PathVariable {
    private final static String _CURLY_OPEN = "{";
    private final static String _CURLY_CLOSE = "}";

    private final static String REFERENCE = _CURLY_OPEN + Param.REFERENCE + _CURLY_CLOSE;
  }

  private final static String _SLASH = "/";
  private final static String _API = _SLASH + "api" + _SLASH;

  public final static String HEROES = _API + "heroes";
  public final static String HERO = HEROES + _SLASH + PathVariable.REFERENCE;
}
