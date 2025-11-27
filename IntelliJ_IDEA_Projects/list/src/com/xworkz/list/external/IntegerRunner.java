package com.xworkz.list.external;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IntegerRunner {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            Integer integer = (Integer) object;
            if (integer==1){
                iterator.add(11);
            }
            if (integer==2){
                iterator.add(22);
            }
            if (integer==3){
                iterator.add(33);
            }
            if (integer==4){
                iterator.remove();
            }
            if (integer==5){
                iterator.remove();
            }
            if (integer==6){
                iterator.remove();
            }
        }
        System.out.println(list);

    }

}
