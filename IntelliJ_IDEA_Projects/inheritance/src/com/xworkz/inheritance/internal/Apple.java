package com.xworkz.inheritance.internal;

public class Apple extends Fruit{

    public String fruitName;

    public Apple(String fruitName){

        super();
        this.fruitName=fruitName;

    }

    public void appleDetails(){

        System.out.println("The name of the fruit is = "+fruitName);

    }

}
