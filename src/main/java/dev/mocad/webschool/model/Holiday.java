package dev.mocad.webschool.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Holiday {

  private final String day;
  private final String reason;
  private final Type type;

  public enum Type {
    FESTIVAL, FEDERAL
  }

}

