package com.xworkz.fruits.external;

import com.xworkz.fruits.bridge.GrapeDetails;
import com.xworkz.fruits.bridge.GrapeInfo;
import com.xworkz.fruits.internal.Grape;

public class GrapeInfoRunner {

    public static void main(String[] args) {

        Grape grape = new Grape("Grape",60,46);

        GrapeInfo info = new GrapeDetails("GrapeDetails",grape);

        info.grapeFruitDetails(grape);
        info.fruitPrice(grape);
        info.fruitName(grape);
        info.isFruitGrape(grape);
        info.fruitSellingTax(grape);

    }

}
