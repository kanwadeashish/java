package com.xworkz.food.bridge;

public interface EggSandwich {

    EggSandwich sandwichDetails(EggSandwich sandwichInfo);

    boolean isEggDesi(EggSandwich sandwichInfo);

    int dishPrice(EggSandwich sandwichInfo);

    String eggType(EggSandwich sandwichInfo);

    double dishTax(EggSandwich sandwichInfo);

}
