package com.xworkz.food.bridge;

import com.xworkz.food.internal.Egg;

public class EggRollInfo implements EggRoll{

    public int rollPrice;
    public Egg egg;

    public EggRollInfo(int rollPrice, Egg egg) {
        this.rollPrice = rollPrice;
        this.egg = egg;
    }

    @Override
    public EggRoll rollDetails(EggRoll rollInfo) {
        System.out.println("The price of the eggRice is = "+rollPrice);
        System.out.println("The price of the egg is = "+egg.eggPrice);
        System.out.println("The type of the egg is = "+egg.eggType);
        System.out.println("the tax on the dish is = "+egg.tax);
        return rollInfo;
    }

    @Override
    public boolean isEggDesi(EggRoll rollInfo) {
        if (egg.eggType=="Desi"){
            System.out.println("The egg is desi.");
            return true;
        }else {
            System.out.println("The egg is not desi.");
            return false;
        }
    }

    @Override
    public int dishPrice(EggRoll rollInfo) {
        System.out.println("The price of the dish is = "+rollPrice);
        return rollPrice;
    }

    @Override
    public String eggType(EggRoll rollInfo) {
        System.out.println("The type of egg used in the roll is = "+egg.eggType);
        return egg.eggType;
    }

    @Override
    public double dishTax(EggRoll rollInfo) {
        System.out.println("The tax on the dish is = "+egg.tax);
        return egg.tax;
    }
}
