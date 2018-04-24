package com.github.caiogarcia.requirementtracker.annotations;

public @interface Requirement {

  int[] requirement() default {};

  int[] fields() default {};

  int[] businesRoles() default {};
}
