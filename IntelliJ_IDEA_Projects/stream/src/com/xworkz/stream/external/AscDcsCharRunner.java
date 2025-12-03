package com.xworkz.stream.external;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscDcsCharRunner {

    public static void main(String[] args) {

        ArrayList<Character> character = new ArrayList<Character>();
        character.add('a');
        character.add('j');
        character.add('f');
        character.add('i');
        character.add('g');
        character.add('h');
        character.add('e');
        character.add('d');
        character.add('c');
        character.add('b');

        List<Character> list = character.stream().filter(n-> n!=null).sorted().collect(Collectors.toList());
        System.out.println(list);

        List<Character> listOne = character.stream().filter(n-> n!=null).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(listOne);

    }

}
