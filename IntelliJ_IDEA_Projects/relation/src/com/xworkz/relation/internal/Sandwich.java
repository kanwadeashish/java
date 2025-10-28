package com.xworkz.relation.internal;

public class Sandwich {

    public int price;
    public Bread bread;
    public Stuffing stuffing;

    public Sandwich(int price,Bread bread,Stuffing stuffing){

        this.price=price;
        this.bread=bread;
        this.stuffing=stuffing;

    }

    public void sandwichDetails(){

        System.out.println("The price of the sandwich = "+price);
        System.out.println("The brand of bread used in sandwich = "+bread.breadBrand);
        System.out.println("The price of bread used in sandwich = "+bread.breadPrice);
        System.out.println("The type of stuffing used in sandwich = "+stuffing.stuffingDetails);
        System.out.println("Is the stuffing veg = "+stuffing.isVeg);

    }

}
