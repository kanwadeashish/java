package com.xworkz.food.bridge;

public interface EggRoll {

    EggRoll rollDetails(EggRoll rollInfo);

    boolean isEggDesi(EggRoll rollInfo);

    int dishPrice(EggRoll rollInfo);

    String eggType(EggRoll rollInfo);

    double dishTax(EggRoll rollInfo);

}
