package com.xworkz.collectionExample.external;

import java.util.ArrayList;
import java.util.Collection;

public class StudentResultRunner {

    public static void main(String[] args) {

        Collection<Double> result = new ArrayList<>();

        result.add(80.88);
        result.add(60.79);
        result.add(99.77);
        System.out.println(result);
        System.out.println(result.size());

        result.clear();
        System.out.println(result);
        System.out.println(result.size());


    }

}
