package com.xworkz.fruits.bridge;

import com.xworkz.fruits.internal.Coconut;

public interface CoconutInfo {

    Coconut coconutFruitDetails(Coconut coconutInfo);

    int fruitPrice(Coconut coconutInfo);

    String fruitName(Coconut coconutInfo);

    boolean isFruitCoconut(Coconut coconutInfo);

    double fruitSellingTax(Coconut coconutInfo);

}
