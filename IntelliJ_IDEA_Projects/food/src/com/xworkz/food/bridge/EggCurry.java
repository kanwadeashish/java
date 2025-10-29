package com.xworkz.food.bridge;

public interface EggCurry {

    EggCurry curryDetails(EggCurry curryInfo);

    boolean isEggDesi(EggCurry curryInfo);

    int dishPrice(EggCurry curryInfo);

    String eggType(EggCurry curryInfo);

    double dishTax(EggCurry curryInfo);

}
