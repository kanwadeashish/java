package com.xworkz.polymorphism.overriding;

public class Fruit {

    public void fruitPrice(int price){
        System.out.println("The price of the fruit is : "+price);
    }

    public void fruitName(String name){
        System.out.println("The name of the fruit is : "+name);
    }

    public void fruitQuantity(int number){
        System.out.println("The quantity of the fruit is : "+number);
    }

    public void fruitTaste(boolean isSweet){
        System.out.println("Is the fruit sweet : "+isSweet);
    }

    public void fruitTax(double tax){
        System.out.println("The tax on the fruit is : "+tax);
    }

}
