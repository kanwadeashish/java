package com.xworkz.fruits.bridge;

import com.xworkz.fruits.internal.Apple;

public interface AppleInfo {

    Apple appleFruitDetails(Apple appleInfo);

    int fruitPrice(Apple appleInfo);

    String fruitName(Apple appleInfo);

    boolean isFruitApple(Apple appleInfo);

    double fruitSellingTax(Apple appleInfo);

}
