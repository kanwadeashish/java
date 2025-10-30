package com.xworkz.fruits.bridge;

import com.xworkz.fruits.internal.Mango;

public interface MangoInfo {

    Mango mangoFruitDetails(Mango mangoInfo);

    int fruitPrice(Mango mangoInfo);

    String fruitName(Mango mangoInfo);

    boolean isFruitMango(Mango mangoInfo);

    double fruitSellingTax(Mango mangoInfo);

}
