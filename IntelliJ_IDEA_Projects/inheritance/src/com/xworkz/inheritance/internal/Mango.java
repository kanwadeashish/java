package com.xworkz.inheritance.internal;

public class Mango extends Fruit{

    public String fruitName;

    public Mango(String fruitName){

        super();
        this.fruitName=fruitName;

    }

    public void mangoDetails(){

        System.out.println("The name of the fruit is = "+fruitName);

    }

}
