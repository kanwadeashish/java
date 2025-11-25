package com.xworkz.collectionExample.external;

import java.util.ArrayList;
import java.util.Collection;

public class StudentNamesRunner {

    public static void main(String[] args) {

        Collection<String> names = new ArrayList<>();

        names.add("Ajay");
        names.add("Vijay");
        names.add("Sujay");
        System.out.println(names);
        System.out.println(names.size());

        names.clear();
        System.out.println(names);
        System.out.println(names.size());

    }

}
