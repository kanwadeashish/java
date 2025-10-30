package com.xworkz.fruits.external;

import com.xworkz.fruits.bridge.CoconutDetails;
import com.xworkz.fruits.bridge.CoconutInfo;
import com.xworkz.fruits.internal.Coconut;

public class CoconutInfoRunner {

    public static void main(String[] args) {

        Coconut coconut = new Coconut("Coconut",25,4.9);

        CoconutInfo info = new CoconutDetails("CoconutDetails",coconut);

        info.coconutFruitDetails(coconut);
        info.fruitPrice(coconut);
        info.fruitName(coconut);
        info.fruitSellingTax(coconut);
        info.isFruitCoconut(coconut);
    }

}
