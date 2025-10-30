package com.xworkz.fruits.bridge;

import com.xworkz.fruits.internal.Grape;

public interface GrapeInfo {

    Grape grapeFruitDetails(Grape grapeInfo);

    int fruitPrice(Grape grapeInfo);

    String fruitName(Grape grapeInfo);

    boolean isFruitGrape(Grape grapeInfo);

    double fruitSellingTax(Grape grapeInfo);

}
