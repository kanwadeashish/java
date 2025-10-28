package com.xworkz.relation.external;

import com.xworkz.relation.internal.Fruit;
import com.xworkz.relation.internal.Tree;

public class TreeRunner {

    public static void main(String[] args) {

        Tree tree = new Tree("Appe Tree",true);
        Fruit fruit = new Fruit("Apple",tree);
        fruit.displayDetails();

    }

}
