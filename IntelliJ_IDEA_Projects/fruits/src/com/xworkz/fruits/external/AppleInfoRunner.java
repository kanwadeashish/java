package com.xworkz.fruits.external;

import com.xworkz.fruits.bridge.AppleDetails;
import com.xworkz.fruits.bridge.AppleInfo;
import com.xworkz.fruits.internal.Apple;

public class AppleInfoRunner {

    public static void main(String[] args) {

        Apple apple = new Apple(200,"Apple",5.5);

        AppleInfo info = new AppleDetails("AppleDetails",apple);

        info.appleFruitDetails(apple);
        info.fruitPrice(apple);
        info.fruitName(apple);
        info.isFruitApple(apple);
        info.fruitSellingTax(apple);

    }

}
