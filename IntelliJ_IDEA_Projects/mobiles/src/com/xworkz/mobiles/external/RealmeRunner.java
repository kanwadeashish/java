package com.xworkz.mobiles.external;

import com.xworkz.mobiles.bridge.Realme;
import com.xworkz.mobiles.bridge.RealmeInfo;

public class RealmeRunner {

    public static void main(String[] args) {

        Realme realme = new RealmeInfo();
        String name = realme.brandName("Realme");
        System.out.println(name);

    }

}
