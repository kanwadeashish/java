package com.xworkz.food.bridge;

import com.xworkz.food.internal.Egg;

public class EggRiceInfo implements EggRice{

    public int ricePrice;
    public Egg egg;

    public EggRiceInfo(int ricePrice, Egg egg) {
        this.ricePrice = ricePrice;
        this.egg = egg;
    }

    @Override
    public EggRice riceDetails(EggRice riceInfo) {
        System.out.println("The price of the eggRice is = "+ricePrice);
        System.out.println("The price of the egg is = "+egg.eggPrice);
        System.out.println("The type of the egg is = "+egg.eggType);
        System.out.println("the tax on the dish is = "+egg.tax);
        return riceInfo;
    }

    @Override
    public boolean isEggDesi(EggRice riceInfo) {
        if (egg.eggType=="Desi"){
            System.out.println("The egg is desi.");
            return true;
        }else {
            System.out.println("The egg is not desi.");
            return false;
        }
    }

    @Override
    public int dishPrice(EggRice riceInfo) {
        System.out.println("The price of the rice is = "+ricePrice);
        return ricePrice;
    }

    @Override
    public String eggType(EggRice riceInfo) {
        System.out.println("The type of the dish is = "+egg.eggType);
        return egg.eggType;
    }

    @Override
    public double dishTax(EggRice riceInfo) {
        System.out.println("The tax on the dish is = "+egg.tax);
        return egg.tax;
    }
}
