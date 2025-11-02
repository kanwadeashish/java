package com.xworkz.mobiles.external;

import com.xworkz.mobiles.bridge.Moto;
import com.xworkz.mobiles.bridge.MotoInfo;

public class MotoRunner {

    public static void main(String[] args) {

        Moto moto = new MotoInfo();
        String name = moto.brandName("Moto");
        System.out.println(name);

    }

}
