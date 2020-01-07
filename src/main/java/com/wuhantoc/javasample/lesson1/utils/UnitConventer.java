package com.wuhantoc.javasample.lesson1.utils;

import com.wuhantoc.javasample.lesson1.enums.UnitEnum;

public class UnitConventer {

  private static final double FOOT_TO_YARD_RATIO = 1d / 3d;

  public static double convertToYard(double number, UnitEnum unit) {
    if (UnitEnum.FOOT.equals(unit)) {
      return number * FOOT_TO_YARD_RATIO;
    }
    return -1;
  }

}
