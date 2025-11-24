package com.xworkz.wrapper.external;

import com.xworkz.wrapper.dto.Nexon;

public class NexonRunner {

    public static void main(String[] args) {

        Nexon nexon = new Nexon("Nexon",1200000, (byte) 1, (short) 11,123456789L,1.2,9.9f,false,'a');

        String printToString = nexon.toString();
        System.out.println(printToString);

        int printHashCode = nexon.hashCode();
        System.out.println(printHashCode);

        Object object = new Object();
        boolean printEquals = nexon.equals(object);
        System.out.println(printEquals);
    }

}
