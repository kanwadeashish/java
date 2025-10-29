package com.xworkz.food.bridge;

public interface EggRice {

    EggRice riceDetails(EggRice riceInfo);

    boolean isEggDesi(EggRice riceInfo);

    int dishPrice(EggRice riceInfo);

    String eggType(EggRice riceInfo);

    double dishTax(EggRice riceInfo);

}
