package com.xworkz.mobiles.external;

import com.xworkz.mobiles.bridge.Mi;
import com.xworkz.mobiles.bridge.MiInfo;

public class MiRunner {

    public static void main(String[] args) {

        Mi mi = new MiInfo();
        int price = mi.price(20000);
        System.out.println(price);

    }

}
