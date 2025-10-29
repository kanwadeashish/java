package com.xworkz.food.external;

import com.xworkz.food.bridge.EggSandwich;
import com.xworkz.food.bridge.EggSandwichInfo;
import com.xworkz.food.internal.Egg;

public class EggSandwichRunner {

    public static void main(String[] args) {

        Egg egg = new Egg(5,"Commercial",6.5);

        EggSandwich sandwich = new EggSandwichInfo(60,egg);

        sandwich.sandwichDetails(sandwich);
        sandwich.dishPrice(sandwich);
        sandwich.eggType(sandwich);
        sandwich.isEggDesi(sandwich);
        sandwich.dishTax(sandwich);

    }

}
