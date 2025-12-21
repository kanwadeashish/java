package com.xworkz.association.external;

import com.xworkz.association.internal.Fruit;
import com.xworkz.association.internal.Tree;

public class TreeRunner {

    public static void main(String[] args) {

        Tree tree = new Tree("Appe Tree",true);
        Fruit fruit = new Fruit("Apple",tree);
        fruit.displayDetails();

    }

}
