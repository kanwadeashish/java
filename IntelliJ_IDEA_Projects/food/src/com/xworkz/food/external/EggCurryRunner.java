package com.xworkz.food.external;

import com.xworkz.food.bridge.EggCurry;
import com.xworkz.food.bridge.EggCurryInfo;
import com.xworkz.food.internal.Egg;

public class EggCurryRunner {

    public static void main(String[] args) {

        Egg egg = new Egg(5,"Commercial",8.5);

        EggCurry curry = new EggCurryInfo(60,egg);

        curry.curryDetails(curry);
        curry.dishPrice(curry);
        curry.eggType(curry);
        curry.isEggDesi(curry);
        curry.dishTax(curry);

    }

}
