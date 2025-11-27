package com.xworkz.list.external;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class FloatRunner {

    public static void main(String[] args) {

        List<Float> list = new LinkedList<>();
        list.add(1.1f);
        list.add(2.2f);
        list.add(3.3f);
        list.add(4.4f);
        list.add(5.5f);
        list.add(6.6f);
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            Float number = (Float) object;
            if (number==1.1f){
                iterator.add(11.1f);
            }
            if (number==2.2f){
                iterator.add(22.2f);
            }
            if (number==3.3f){
                iterator.add(33.3f);
            }
            if (number==4.4f){
                iterator.remove();
            }
            if (number==5.5f){
                iterator.remove();
            }
            if (number==6.6f){
                iterator.remove();
            }
        }
        System.out.println(list);

    }

}
