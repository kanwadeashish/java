package com.xworkz.mobiles.external;

import com.xworkz.mobiles.bridge.Samsung;
import com.xworkz.mobiles.bridge.SamsungInfo;

public class SamsungRunner {

    public static void main(String[] args) {

        Samsung samsung = new SamsungInfo();
        String  name = samsung.brandName("Samsung");
        System.out.println(name);

    }

}
