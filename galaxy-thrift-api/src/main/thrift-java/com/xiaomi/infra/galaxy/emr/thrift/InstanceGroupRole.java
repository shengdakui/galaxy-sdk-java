/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emr.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

public enum InstanceGroupRole implements libthrift091.TEnum {
  MASTER(1),
  CONTROL(2),
  CORE(3),
  TASK(4);

  private final int value;

  private InstanceGroupRole(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static InstanceGroupRole findByValue(int value) { 
    switch (value) {
      case 1:
        return MASTER;
      case 2:
        return CONTROL;
      case 3:
        return CORE;
      case 4:
        return TASK;
      default:
        return null;
    }
  }
}
