package com.xworkz.inherit.internal;

public class Flower {

    public String flowerName;
    public int price;

    public Flower(String fruitName,int price) {
        this.flowerName =fruitName;
        this.price = price;
    }

    public void showName(){

        System.out.println("The Name of the flower is = "+ flowerName);

    }
    public void showPrice(){

        System.out.println("The price of the flower is = "+price);

    }

}
