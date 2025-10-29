package com.xworkz.food.external;

import com.xworkz.food.bridge.EggRice;
import com.xworkz.food.bridge.EggRiceInfo;
import com.xworkz.food.internal.Egg;

public class EggRiceRunner {

    public static void main(String[] args) {

        Egg egg = new Egg(5,"Desi",5.5);

        EggRice rice = new EggRiceInfo(50,egg);
        rice.riceDetails(rice);
        rice.isEggDesi(rice);
        rice.dishPrice(rice);
        rice.eggType(rice);
        rice.dishTax(rice);


    }

}
