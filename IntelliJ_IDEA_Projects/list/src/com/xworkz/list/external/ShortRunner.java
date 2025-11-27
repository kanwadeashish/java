package com.xworkz.list.external;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ShortRunner {

    public static void main(String[] args) {

        List<Short> list = new LinkedList<>();
        list.add((short) 1);
        list.add((short) 2);
        list.add((short) 3);
        list.add((short) 4);
        list.add((short) 5);
        list.add((short) 6);
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            Short number = (Short) object;
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

