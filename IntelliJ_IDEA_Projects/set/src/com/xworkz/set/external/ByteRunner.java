package com.xworkz.set.external;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ByteRunner {

    public static void main(String[] args) {

        Set<Byte> set = new TreeSet<>();
        set.add((byte) 1);
        set.add((byte) 2);
        set.add((byte) 3);
        set.add((byte) 1);
        set.add((byte) 4);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            Byte number = (Byte) object;

            if (number == 3) {
                iterator.remove();
            }
        }
        System.out.println(set);

    }

}
