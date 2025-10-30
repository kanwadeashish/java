package com.xworkz.fruits.bridge;

import com.xworkz.fruits.internal.Mango;

public class MangoDetails implements MangoInfo{

    public String className;
    public Mango mango;

    public MangoDetails(String className, Mango mango) {
        this.className = className;
        this.mango = mango;
    }

    @Override
    public Mango mangoFruitDetails(Mango mangoInfo) {
        System.out.println("Ths is details of the class = "+className);
        return mangoInfo;
    }

    @Override
    public int fruitPrice(Mango mangoInfo) {
        System.out.println("The price of the fruit is = "+mangoInfo.fruitPrice);
        return mangoInfo.fruitPrice;
    }

    @Override
    public String fruitName(Mango mangoInfo) {
        System.out.println("The name of the fruit is = "+mangoInfo.fruitName);
        return mangoInfo.fruitName;
    }

    @Override
    public boolean isFruitMango(Mango mangoInfo) {
        if (mangoInfo.fruitName=="Mango"){
            System.out.println("The fruit is Mango.");
            return true;
        }else {
            System.out.println("The fruit is not Mango.");
            return false;
        }
    }

    @Override
    public double fruitSellingTax(Mango mangoInfo) {
        System.out.println("The tax on the fruit is = "+mangoInfo.fruitTax);
        return mangoInfo.fruitTax;
    }
}
