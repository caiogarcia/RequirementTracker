package com.github.caiogarcia.requirementtracker.enumeration;

import com.github.caiogarcia.requirementtracker.annotations.Requirement;

public class Fields {

  /**
   * <h1>MY_CRUD_FIELD_ONE</h1>
   * <p>
   * Description for fist field of the My Crud
   * </p>
   *
   * @author Caio Garcia
   * @since 23/04/2018
   */
  @Requirement(businesRoles = { BusinesRoles.MY_CRUD_FIELD_ONE_BUSINES_ROLE_ONE,
      BusinesRoles.MY_CRUD_FIELD_ONE_BUSINES_ROLE_TWO })
  public static final int MY_CRUD_FIELD_ONE = 2;
  /**
   * <h1>MY_CRUD_FIELD_TWO</h1>
   * <p>
   * Description for second field of the My Crud
   * </p>
   *
   * @author Caio Garcia
   * @since 23/04/2018
   */
  public static final int MY_CRUD_FIELD_TWO = 5;

}
