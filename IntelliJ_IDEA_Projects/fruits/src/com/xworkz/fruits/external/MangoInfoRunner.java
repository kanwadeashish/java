package com.xworkz.fruits.external;

import com.xworkz.fruits.bridge.MangoDetails;
import com.xworkz.fruits.bridge.MangoInfo;
import com.xworkz.fruits.internal.Mango;

public class MangoInfoRunner {

    public static void main(String[] args) {

        Mango mango = new Mango("Mango",90,7.5);

        MangoInfo info = new MangoDetails("MangoDetails",mango);

        info.mangoFruitDetails(mango);
        info.fruitPrice(mango);
        info.fruitName(mango);
        info.isFruitMango(mango);
        info.fruitSellingTax(mango);


    }

}
