package com.xworkz.stream.external;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneNumberRunner {

    public static void main(String[] args) {

        ArrayList<Long> list = new ArrayList<Long>();
        list.add(1234567890L);
        list.add(2234567890L);
        list.add(3234567890L);
        list.add(4234567890L);
        list.add(5234567890L);
        list.add(6234567890L);
        list.add(7234567890L);
        list.add(8234567890L);
        list.add(9234567890L);
        list.add(9994567890L);

        List<Long> print = list.stream().filter(n-> String.valueOf(n).startsWith("9")).sorted().collect(Collectors.toList());
        System.out.println(print);

    }

}
