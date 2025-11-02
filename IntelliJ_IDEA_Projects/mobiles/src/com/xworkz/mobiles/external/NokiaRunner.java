package com.xworkz.mobiles.external;

import com.xworkz.mobiles.bridge.Nokia;
import com.xworkz.mobiles.bridge.NokiaInfo;

public class NokiaRunner {

    public static void main(String[] args) {

        Nokia nokia = new NokiaInfo();
        int price = nokia.phonePrice(12000);
        System.out.println(price);

    }

}
