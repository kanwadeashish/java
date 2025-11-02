package com.xworkz.mobiles.external;

import com.xworkz.mobiles.bridge.Apple;
import com.xworkz.mobiles.bridge.AppleInfo;

public class AppleRunner {

    public static void main(String[] args) {

        Apple apple = new AppleInfo();
        String brandName = apple.brandName("Apple");
        System.out.println(brandName);
    }

}
