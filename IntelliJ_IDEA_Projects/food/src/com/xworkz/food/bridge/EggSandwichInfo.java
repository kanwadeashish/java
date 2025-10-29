package com.xworkz.food.bridge;

import com.xworkz.food.internal.Egg;

public class EggSandwichInfo implements EggSandwich{

    public int sandwichPrice;
    public Egg egg;

    public EggSandwichInfo(int sandwichPrice, Egg egg) {
        this.sandwichPrice = sandwichPrice;
        this.egg = egg;
    }

    @Override
    public EggSandwich sandwichDetails(EggSandwich sandwichInfo) {
        System.out.println("The price of the eggRice is = "+sandwichPrice);
        System.out.println("The price of the egg is = "+egg.eggPrice);
        System.out.println("The type of the egg is = "+egg.eggType);
        System.out.println("the tax on the dish is = "+egg.tax);
        return sandwichInfo;
    }

    @Override
    public boolean isEggDesi(EggSandwich sandwichInfo) {
        if (egg.eggType=="Desi"){
            System.out.println("The egg is desi.");
            return true;
        }else if (egg.eggType=="Commercial"){
            System.out.println("The egg is not desi but commercial.");
            return false;
        }else {
            System.out.println("The egg is not desi.");
            return false;
        }
    }

    @Override
    public int dishPrice(EggSandwich sandwichInfo) {
        System.out.println("The price of the egg is = "+sandwichPrice);
        return sandwichPrice;
    }

    @Override
    public String eggType(EggSandwich sandwichInfo) {
        System.out.println("The type of the egg is = "+egg.eggType);
        return egg.eggType;
    }

    @Override
    public double dishTax(EggSandwich sandwichInfo) {
        System.out.println("The tax on the sandwich is = "+egg.tax);
        return egg.tax;
    }
}
