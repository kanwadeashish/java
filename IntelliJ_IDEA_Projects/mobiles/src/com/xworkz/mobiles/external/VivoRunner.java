package com.xworkz.mobiles.external;

import com.xworkz.mobiles.bridge.Vivo;
import com.xworkz.mobiles.bridge.VivoInfo;

public class VivoRunner {

    public static void main(String[] args) {

        Vivo vivo = new VivoInfo();
        String name = vivo.brandName("Vivo");
        System.out.println(name);

    }

}
