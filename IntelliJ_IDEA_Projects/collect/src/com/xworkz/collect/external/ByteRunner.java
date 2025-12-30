package com.xworkz.collect.external;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ByteRunner {

    public static void main(String[] args) {

        List<Byte> list = new LinkedList<>();
        list.add((byte) 1);
        list.add((byte) 2);
        list.add((byte) 3);
        list.add((byte) 4);
        list.add((byte) 5);
        list.add((byte) 6);
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            Byte number = (Byte) object;
            if (number==1){
                iterator.add(11);
            }
            if (number==2){
                iterator.add(22);
            }
            if (number==3){
                iterator.add(33);
            }
            if (number==4){
                iterator.remove();
            }
            if (number==5){
                iterator.remove();
            }
            if (number==6){
                iterator.remove();
            }
        }
        System.out.println(list);

    }

}
