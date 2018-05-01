package com.github.caiogarcia.requirementtracker.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface Requirement {

  int[] requirement() default {};

  int[] fields() default {};

  int[] businesRoles() default {};
}
