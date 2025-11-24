package com.xworkz.wrapper.external;

import com.xworkz.wrapper.dto.Nano;

public class NanoRunner {

    public static void main(String[] args) {

        Nano nano = new Nano("Nano",1200000, (byte) 1, (short) 11,123456789L,1.2,9.9f,false,'a');

        String printToString = nano.toString();
        System.out.println(printToString);

        int printHashCode = nano.hashCode();
        System.out.println(printHashCode);

        Object object = new Object();
        boolean printEquals = nano.equals(object);
        System.out.println(printEquals);
    }

}
