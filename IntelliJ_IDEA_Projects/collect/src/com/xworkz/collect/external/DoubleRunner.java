package com.xworkz.collect.external;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DoubleRunner {

    public static void main(String[] args) {

        List<Double> list = new LinkedList<>();
        list.add(1.1);
        list.add(2.2);
        list.add(3.3);
        list.add(4.4);
        list.add(5.5);
        list.add(6.6);
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            Double number = (Double) object;
            if (number==1.1){
                iterator.add(11.1);
            }
            if (number==2.2){
                iterator.add(22.2);
            }
            if (number==3.3){
                iterator.add(33.3);
            }
            if (number==4.4){
                iterator.remove();
            }
            if (number==5.5){
                iterator.remove();
            }
            if (number==6.6){
                iterator.remove();
            }
        }
        System.out.println(list);

    }

}
