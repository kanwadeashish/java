package com.xworkz.wrapper.external;

import com.xworkz.wrapper.dto.Baleno;

public class BalenoRunner {

    public static void main(String[] args) {

        Baleno baleno = new Baleno("Baleno",1200000, (byte) 1, (short) 11,123456789L,1.2,9.9f,false,'a');

        String printToString = baleno.toString();
        System.out.println(printToString);

        int printHashCode = baleno.hashCode();
        System.out.println(printHashCode);

        Object object = new Object();
        boolean printEquals = baleno.equals(object);
        System.out.println(printEquals);
    }

}
