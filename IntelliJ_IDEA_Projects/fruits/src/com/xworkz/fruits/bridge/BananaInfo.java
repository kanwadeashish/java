package com.xworkz.fruits.bridge;

import com.xworkz.fruits.internal.Banana;

public interface BananaInfo {

    Banana bananaFruitDetails(Banana bananaInfo);

    int fruitPrice(Banana bananaInfo);

    String fruitName(Banana bananaInfo);

    boolean isFruitBanana(Banana bananaInfo);

    double fruitSellingTax(Banana bananaInfo);

}
