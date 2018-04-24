package com.github.caiogarcia.requirementtracker.bll;

import com.github.caiogarcia.requirementtracker.annotations.Requirement;
import com.github.caiogarcia.requirementtracker.enumeration.Fields;
import com.github.caiogarcia.requirementtracker.enumeration.Requirements;

@Requirement(requirement = Requirements.MY_CRUD)
public class MyClass {

  @Requirement(
      requirement = Requirements.MY_CRUD,
      fields = Fields.MY_CRUD_FIELD_ONE)
  public void MethodOne() {

    // Code goes here
  }
}
