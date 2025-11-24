package com.xworkz.wrapper.external;

import com.xworkz.wrapper.dto.Swift;

public class SwiftRunner {

    public static void main(String[] args) {

        Swift swift = new Swift("Swift",1200000, (byte) 1, (short) 11,123456789L,1.2,9.9f,false,'a');

        String printToString = swift.toString();
        System.out.println(printToString);

        int printHashCode = swift.hashCode();
        System.out.println(printHashCode);

        Object object = new Object();
        boolean printEquals = swift.equals(object);
        System.out.println(printEquals);
    }

}
