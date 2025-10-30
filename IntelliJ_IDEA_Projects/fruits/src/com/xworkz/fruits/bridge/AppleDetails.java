package com.xworkz.fruits.bridge;

import com.xworkz.fruits.internal.Apple;

public class AppleDetails implements AppleInfo{

    public String className;
    public Apple apple;

    public AppleDetails(String className, Apple apple) {
        this.className = className;
        this.apple = apple;
    }

    @Override
    public Apple appleFruitDetails(Apple appleInfo) {
        System.out.println("Below is the details of the class = "+className);
        return appleInfo;
    }

    @Override
    public int fruitPrice(Apple appleInfo) {
        System.out.println("The price of the fruit is = "+apple.applePrice);
        return apple.applePrice;
    }

    @Override
    public String fruitName(Apple appleInfo) {
        System.out.println("The name of the fruit is = "+apple.fruitName);
        return apple.fruitName;
    }

    @Override
    public boolean isFruitApple(Apple appleInfo) {
        if (apple.fruitName=="Apple"){
            System.out.println("The fruit is Apple.");
            return true;
        }else {
            System.out.println("The fruit is not apple.");
            return false;
        }
    }

    @Override
    public double fruitSellingTax(Apple appleInfo) {
        System.out.println("The tax on the fruit is = "+apple.tax);
        return apple.tax;
    }
}
