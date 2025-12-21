package com.xworkz.association.external;

import com.xworkz.association.internal.Bread;
import com.xworkz.association.internal.Sandwich;
import com.xworkz.association.internal.Stuffing;

public class SandwichRunner {

    public static void main(String[] args) {

        Bread bread = new Bread("Balaji",30);

        Stuffing stuffing = new Stuffing("Paneer",true);

        Sandwich sandwich = new Sandwich(50,bread,stuffing);
        sandwich.sandwichDetails();

    }

}
