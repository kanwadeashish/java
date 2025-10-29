package com.xworkz.food.bridge;

import com.xworkz.food.internal.Egg;

public class EggOmletInfo implements EggOmlet{

    public int omletPrice;
    public Egg egg;

    public EggOmletInfo(int omletPrice, Egg egg) {
        this.omletPrice = omletPrice;
        this.egg = egg;
    }

    @Override
    public EggOmlet omletDetails(EggOmlet omletInfo) {
        System.out.println("The price of the eggRice is = "+omletPrice);
        System.out.println("The price of the egg is = "+egg.eggPrice);
        System.out.println("The type of the egg is = "+egg.eggType);
        System.out.println("the tax on the dish is = "+egg.tax);
        return omletInfo;
    }

    @Override
    public boolean isEggDesi(EggOmlet omletInfo) {
        if (egg.eggType=="Desi"){
            System.out.println("The egg is desi.");
            return true;
        }else {
            System.out.println("The egg is not desi.");
            return false;
        }
    }

    @Override
    public int dishPrice(EggOmlet omletInfo) {
        System.out.println("The price of the dish is = "+omletPrice);
        return omletPrice;
    }

    @Override
    public String eggType(EggOmlet omletInfo) {
        System.out.println("The type of the egg is = "+egg.eggType);
        return egg.eggType;
    }

    @Override
    public double dishTax(EggOmlet omletInfo) {
        System.out.println("The tax on the dish is = "+egg.tax);
        return egg.tax;
    }
}
