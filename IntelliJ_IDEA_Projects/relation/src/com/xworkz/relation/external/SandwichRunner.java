package com.xworkz.relation.external;

import com.xworkz.relation.internal.Bread;
import com.xworkz.relation.internal.Sandwich;
import com.xworkz.relation.internal.Stuffing;

public class SandwichRunner {

    public static void main(String[] args) {

        Bread bread = new Bread("Balaji",30);

        Stuffing stuffing = new Stuffing("Paneer",true);

        Sandwich sandwich = new Sandwich(50,bread,stuffing);
        sandwich.sandwichDetails();

    }

}
