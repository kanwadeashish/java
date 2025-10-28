package com.xworkz.inheritance.external;

import com.xworkz.inheritance.internal.Tiger;
import com.xworkz.inheritance.internal.TigerCub;

public class AnimalRunner {

    public static void main(String[] args) {

        TigerCub cub = new TigerCub();
        cub.tigerCubDetails("Tiger Cub");

        Tiger tiger = new Tiger();
        tiger.tigerDetails("Tiger");

    }

}
