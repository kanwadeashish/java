package com.xworkz.list.external;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BooleanRunnner {

    public static void main(String[] args) {

        List<Boolean> list = new LinkedList<>();
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(false);
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            Boolean value = (Boolean) object;
            if (value==true){
                iterator.add(false);
            }
            if (value==false){
                iterator.add(true);
            }
        }
        System.out.println(list);

    }

}
