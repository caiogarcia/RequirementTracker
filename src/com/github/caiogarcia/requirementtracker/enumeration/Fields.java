package com.github.caiogarcia.requirementtracker.enumeration;

import com.github.caiogarcia.requirementtracker.annotations.Requirement;

public class Fields {

  /**
   * Description for fist field of the My Crud
   *
   * @author Caio Garcia
   * @since 23/04/2018
   * @see BusinesRoles.MY_CRUD_FIELD_ONE_BUSINES_ROLE_ONE
   * @see BusinesRoles.MY_CRUD_FIELD_ONE_BUSINES_ROLE_TWO
   */
  @Requirement(businesRoles = { BusinesRoles.MY_CRUD_FIELD_ONE_BUSINES_ROLE_ONE,
      BusinesRoles.MY_CRUD_FIELD_ONE_BUSINES_ROLE_TWO })
  public static final int MY_CRUD_FIELD_ONE = 2;
  /**
   * Description for second field of the My Crud
   *
   * @author Caio Garcia
   * @since 23/04/2018
   */
  public static final int MY_CRUD_FIELD_TWO = 5;

}
