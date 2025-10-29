package com.xworkz.food.bridge;

public interface EggOmlet {

    EggOmlet omletDetails(EggOmlet omletInfo);

    boolean isEggDesi(EggOmlet omletInfo);

    int dishPrice(EggOmlet omletInfo);

    String eggType(EggOmlet omletInfo);

    double dishTax(EggOmlet omletInfo);

}
