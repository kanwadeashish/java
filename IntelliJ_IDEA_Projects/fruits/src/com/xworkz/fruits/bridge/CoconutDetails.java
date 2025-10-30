package com.xworkz.fruits.bridge;

import com.xworkz.fruits.internal.Coconut;

public class CoconutDetails implements CoconutInfo{

    public String className;
    public Coconut coconut;

    public CoconutDetails(String className, Coconut coconut) {
        this.className = className;
        this.coconut = coconut;
    }

    @Override
    public Coconut coconutFruitDetails(Coconut coconutInfo) {
        System.out.println("The name of the class is = "+className);
        return coconutInfo;
    }

    @Override
    public int fruitPrice(Coconut coconutInfo) {
        System.out.println("The price of the fruit is = "+coconutInfo.fruitPrice);
        return coconutInfo.fruitPrice;
    }

    @Override
    public String fruitName(Coconut coconutInfo) {
        System.out.println("The name of the fruit is = "+coconutInfo.fruitName);
        return coconutInfo.fruitName;
    }

    @Override
    public boolean isFruitCoconut(Coconut coconutInfo) {
        if (coconutInfo.fruitName=="Coconut"){
            System.out.println("The fruit is Coconut.");
            return true;
        }else {
            System.out.println("The fruit is not Coconut.");
            return false;
        }
    }

    @Override
    public double fruitSellingTax(Coconut coconutInfo) {
        System.out.println("The tax on the fruit is = "+coconutInfo.fruitTax);
        return coconutInfo.fruitTax;
    }
}
