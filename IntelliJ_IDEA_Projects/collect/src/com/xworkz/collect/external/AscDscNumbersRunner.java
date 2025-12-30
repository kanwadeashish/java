package com.xworkz.collect.external;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscDscNumbersRunner {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(8);
        list.add(9);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(10);

        List<Integer> number = list.stream().filter(n-> n!=0).sorted().collect(Collectors.toList());
        System.out.println(number);

        List<Integer> numberOne = list.stream().filter(n-> n!=0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(numberOne);

    }

}
