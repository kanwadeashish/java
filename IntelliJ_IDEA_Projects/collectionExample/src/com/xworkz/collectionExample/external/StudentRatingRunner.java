package com.xworkz.collectionExample.external;

import java.util.ArrayList;
import java.util.Collection;

public class StudentRatingRunner {

    public static void main(String[] args) {

        Collection<Character> rating = new ArrayList<>();

        rating.add('a');
        rating.add('b');
        rating.add('c');
        rating.add('d');
        System.out.println(rating);
        System.out.println(rating.size());

        rating.clear();
        System.out.println(rating);
        System.out.println(rating.size());

    }

}
