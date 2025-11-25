package com.xworkz.collectionExample.external;

import java.util.ArrayList;
import java.util.Collection;

public class PassingStatusRunner {

    public static void main(String[] args) {

        Collection<Boolean> status = new ArrayList<>();

        status.add(true);
        status.add(false);
        status.add(true);
        System.out.println(status);
        System.out.println(status.size());

        status.clear();
        System.out.println(status);
        System.out.println(status.size());

    }

}
