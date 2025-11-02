package com.xworkz.mobiles.external;

import com.xworkz.mobiles.bridge.Oppo;
import com.xworkz.mobiles.bridge.OppoInfo;

public class OppoRunner {

    public static void main(String[] args) {

        Oppo oppo = new OppoInfo();
        String name = oppo.brandName("Oppo");
        System.out.println(name);

    }

}
