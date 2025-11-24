package com.xworkz.wrapper.external;

import com.xworkz.wrapper.dto.Maruti;

public class MarutiRunner {

    public static void main(String[] args) {

        Maruti maruti = new Maruti("Maruti",1200000, (byte) 1, (short) 11,123456789L,1.2,9.9f,false,'a');

        String printToString = maruti.toString();
        System.out.println(printToString);

        int printHashCode = maruti.hashCode();
        System.out.println(printHashCode);

        Object object = new Object();
        boolean printEquals = maruti.equals(object);
        System.out.println(printEquals);
    }

}
