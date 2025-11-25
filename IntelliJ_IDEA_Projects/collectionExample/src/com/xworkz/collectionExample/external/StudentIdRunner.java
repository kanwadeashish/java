package com.xworkz.collectionExample.external;

import java.util.ArrayList;
import java.util.Collection;

public class StudentIdRunner {

    public static void main(String[] args) {

        Collection<Integer> id = new ArrayList<>();

        id.add(1);
        id.add(2);
        id.add(3);
        System.out.println(id);
        System.out.println(id.size());

        id.clear();
        System.out.println(id);
        System.out.println(id.size());

    }

}
