package com.xworkz.inherit.internal;

public class Fruit {

    public String fruitName;
    public int price;
    public String fruitState;

    public Fruit(String fruitName,int price,String fruitState) {
        this.fruitName=fruitName;
        this.price = price;
        this.fruitState=fruitState;
    }

    public void showName(){

        System.out.println("The Name of the fruit is = "+fruitName);

    }
    public void showPrice(){

        System.out.println("The price of the fruit is = "+price);

    }
    public void showFruitState(){

        System.out.println("The state of the fruit is = "+fruitState);

    }

}
