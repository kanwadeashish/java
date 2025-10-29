package com.xworkz.food.external;

import com.xworkz.food.bridge.EggRoll;
import com.xworkz.food.bridge.EggRollInfo;
import com.xworkz.food.internal.Egg;

public class EggRollRunner {

    public static void main(String[] args) {

        Egg egg = new Egg(7,"Desi",4.9);

        EggRoll roll = new EggRollInfo(40,egg);

        roll.rollDetails(roll);
        roll.dishPrice(roll);
        roll.eggType(roll);
        roll.isEggDesi(roll);
        roll.dishTax(roll);

    }

}
