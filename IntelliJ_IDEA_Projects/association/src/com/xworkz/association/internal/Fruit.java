package com.xworkz.association.internal;

public class Fruit {

    public String fruitName;
    public Tree tree;

    public Fruit(String fruitName,Tree tree){

        this.fruitName=fruitName;
        this.tree=tree;

    }

    public void displayDetails(){

        System.out.println("The name of the tree is = "+tree.treeName);
        System.out.println("Is this tree bears fruit = "+tree.bearsFruit);
        System.out.println("The name of the fruit is = "+fruitName);

    }

}
