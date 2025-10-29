package com.xworkz.food.external;

import com.xworkz.food.bridge.EggOmlet;
import com.xworkz.food.bridge.EggOmletInfo;
import com.xworkz.food.internal.Egg;

public class EggOmletRunner {

    public static void main(String[] args) {

        Egg egg = new Egg(6,"Desi",4.6);

        EggOmlet omlet = new EggOmletInfo(40,egg);

        omlet.omletDetails(omlet);
        omlet.dishPrice(omlet);
        omlet.eggType(omlet);
        omlet.isEggDesi(omlet);
        omlet.dishTax(omlet);

    }

}
