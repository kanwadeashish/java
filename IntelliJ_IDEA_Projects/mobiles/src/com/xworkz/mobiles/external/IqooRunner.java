package com.xworkz.mobiles.external;

import com.xworkz.mobiles.bridge.Iqoo;
import com.xworkz.mobiles.bridge.IqooInfo;

public class IqooRunner {

    public static void main(String[] args) {

        Iqoo iqoo = new IqooInfo();
        String name = iqoo.brandName("Iqoo");
        System.out.println(name);

    }

}
