package com.github.caiogarcia.requirementtracker.enumeration;

import com.github.caiogarcia.requirementtracker.annotations.Requirement;

public class Requirements {

  /**
   * <h1>MY_CRUD</h1>
   * <p>
   * Description for My Crud requirement.
   * </p>
   *
   * @author Caio Garcia
   * @since 23/04/2018
   */
  @Requirement(fields = { Fields.MY_CRUD_FIELD_ONE, Fields.MY_CRUD_FIELD_TWO })
  public static final int MY_CRUD = 1;
}
