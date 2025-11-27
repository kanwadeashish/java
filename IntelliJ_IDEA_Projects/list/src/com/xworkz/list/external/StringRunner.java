package com.xworkz.list.external;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StringRunner {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("KTM");
        list.add("Yamaha");
        list.add("Hero");
        list.add("Honda");
        list.add("Suzuki");
        list.add("Activa");
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            String string = (String) object;
            if (string=="KTM"){
                iterator.add("Duke");
            }
            if (string=="Yamaha"){
                iterator.add("R15");
            }
            if (string=="Hero"){
                iterator.add("Splender");
            }
            if (string=="Honda"){
                iterator.remove();
            }
            if (string=="Suzuki"){
                iterator.remove();
            }
            if (string=="Activa"){
                iterator.remove();
            }
        }
        System.out.println(list);

    }

}
