package com.github.caiogarcia.requirementtracker.enumeration;

import com.github.caiogarcia.requirementtracker.annotations.Requirement;

public class Requirements {

  /**
   * Description for My Crud requirement.
   *
   * @author Caio Garcia
   * @since 23/04/2018
   * @see Fields.MY_CRUD_FIELD_ONE
   * @see Fields.MY_CRUD_FIELD_TWO
   */
  @Requirement(fields = { Fields.MY_CRUD_FIELD_ONE, Fields.MY_CRUD_FIELD_TWO })
  public static final int MY_CRUD = 1;
}
