package com.xworkz.fruits.bridge;

import com.xworkz.fruits.internal.Grape;

public class GrapeDetails implements GrapeInfo{

    public String className;
    public Grape grape;

    public GrapeDetails(String className, Grape grape) {
        this.className = className;
        this.grape = grape;
    }

    @Override
    public Grape grapeFruitDetails(Grape grapeInfo) {
        System.out.println("The name of the class is = "+className);
        return grapeInfo;
    }

    @Override
    public int fruitPrice(Grape grapeInfo) {
        System.out.println("The price of the fruit is = "+grapeInfo.fruitPrice);
        return grapeInfo.fruitPrice;
    }

    @Override
    public String fruitName(Grape grapeInfo) {
        System.out.println("The name of the fruit is = "+grapeInfo.fruitName);
        return grapeInfo.fruitName;
    }

    @Override
    public boolean isFruitGrape(Grape grapeInfo) {
        if (grapeInfo.fruitName=="Grape"){
            System.out.println("The fruit is Grape.");
            return true;
        }else {
            System.out.println("The fruit is not Grape.");
            return false;
        }
    }

    @Override
    public double fruitSellingTax(Grape grapeInfo) {
        System.out.println("The tax on the fruit is = "+grapeInfo.fruitTax);
        return grapeInfo.fruitTax;
    }
}
