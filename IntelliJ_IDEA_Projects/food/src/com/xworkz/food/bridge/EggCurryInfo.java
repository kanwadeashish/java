package com.xworkz.food.bridge;

import com.xworkz.food.internal.Egg;

public class EggCurryInfo implements EggCurry{

    public int curryPrice;
    public Egg egg;

    public EggCurryInfo(int curryPrice, Egg egg) {
        this.curryPrice = curryPrice;
        this.egg = egg;
    }

    @Override
    public EggCurry curryDetails(EggCurry curryInfo) {
        System.out.println("The price of the eggRice is = "+curryPrice);
        System.out.println("The price of the egg is = "+egg.eggPrice);
        System.out.println("The type of the egg is = "+egg.eggType);
        System.out.println("the tax on the dish is = "+egg.tax);
        return curryInfo;
    }

    @Override
    public boolean isEggDesi(EggCurry curryInfo) {
        if (egg.eggType=="Desi"){
            System.out.println("The egg is desi.");
            return true;
        }else {
            System.out.println("The egg is not desi.");
            return false;
        }
    }

    @Override
    public int dishPrice(EggCurry curryInfo) {
        System.out.println("The price of the dish is = "+curryPrice);
        return curryPrice;
    }

    @Override
    public String eggType(EggCurry curryInfo) {
        System.out.println("The type of the egg used in the dish is = "+egg.eggType);
        return egg.eggType;
    }

    @Override
    public double dishTax(EggCurry curryInfo) {
        System.out.println("The tax on the dish is = "+egg.tax);
        return egg.tax;
    }
}
