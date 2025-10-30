package com.xworkz.fruits.external;

import com.xworkz.fruits.bridge.BananaDetails;
import com.xworkz.fruits.bridge.BananaInfo;
import com.xworkz.fruits.internal.Banana;

public class BananaInfoRunner {

    public static void main(String[] args) {

        Banana banana = new Banana(25,"Banana",5.5);

        BananaInfo info = new BananaDetails("BananaDetails",banana);

        info.bananaFruitDetails(banana);
        info.fruitPrice(banana);
        info.fruitName(banana);
        info.isFruitBanana(banana);
        info.fruitSellingTax(banana);

    }

}
