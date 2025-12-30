package com.xworkz.collect.external;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CharacterRunner {

    public static void main(String[] args) {

        List<Character> list = new LinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            Character value = (Character) object;
            if (value =='a'){
                iterator.add('a');
            }
            if (value =='b'){
                iterator.add('b');
            }
            if (value =='c'){
                iterator.add('c');
            }
            if (value =='d'){
                iterator.remove();
            }
            if (value =='e'){
                iterator.remove();
            }
            if (value =='f'){
                iterator.remove();
            }
        }
        System.out.println(list);

    }

}
