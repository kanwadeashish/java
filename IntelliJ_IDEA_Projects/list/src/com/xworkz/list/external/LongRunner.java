package com.xworkz.list.external;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LongRunner {

    public static void main(String[] args) {

        List<Long> list = new LinkedList<>();
        list.add(123L);
        list.add(213L);
        list.add(345L);
        list.add(456L);
        list.add(567L);
        list.add(678L);
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            Long number = (Long) object;
            if (number==123L){
                iterator.add(111L);
            }
            if (number==213L){
                iterator.add(222L);
            }
            if (number==345L){
                iterator.add(333L);
            }
            if (number==456L){
                iterator.remove();
            }
            if (number==567L){
                iterator.remove();
            }
            if (number==678L){
                iterator.remove();
            }
        }
        System.out.println(list);

    }

}
