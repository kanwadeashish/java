package com.xworkz.fruits.bridge;

import com.xworkz.fruits.internal.Banana;

public class BananaDetails implements BananaInfo{

    public String className;
    public Banana banana;

    public BananaDetails(String className, Banana banana) {
        this.className = className;
        this.banana = banana;
    }

    @Override
    public Banana bananaFruitDetails(Banana bananaInfo) {
        System.out.println("Below is the details of the class = "+className);
        return bananaInfo;
    }

    @Override
    public int fruitPrice(Banana bananaInfo) {
        System.out.println("The price of the fruit is = "+banana.bananaPrice);
        return bananaInfo.bananaPrice;
    }

    @Override
    public String fruitName(Banana bananaInfo) {
        System.out.println("The name of the fruit is = "+bananaInfo.fruitName);
        return bananaInfo.fruitName;
    }

    @Override
    public boolean isFruitBanana(Banana bananaInfo) {
        if (bananaInfo.fruitName=="Banana"){
            System.out.println("The fruit is Banana.");
            return true;
        }else {
            System.out.println("The fruit is not banana.");
            return false;
        }
    }

    @Override
    public double fruitSellingTax(Banana bananaInfo) {
        System.out.println("The tax on the fruit is = "+bananaInfo.tax);
        return bananaInfo.tax;
    }
}
