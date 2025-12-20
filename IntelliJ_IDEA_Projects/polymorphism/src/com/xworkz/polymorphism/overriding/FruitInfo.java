package com.xworkz.polymorphism.overriding;

public class FruitInfo extends Fruit{

    @Override
    public void fruitPrice(int price){
        int extraCharges = 100;
        price = price + extraCharges;
        System.out.println("The price of the fruit is : "+price);
    }

    @Override
    public void fruitName(String name){
        name = name.toLowerCase();
        System.out.println("The name of the fruit is : "+name);
    }

    public void fruitQuantity(int number){
        int quantity = 12;
        number = number + quantity;
        System.out.println("The quantity of the fruit is : "+number);
    }

    public void fruitTaste(boolean isSweet){
        isSweet = !(isSweet);
        System.out.println("Is the fruit sweet : "+isSweet);
    }

    public void fruitTax(double tax){
        double preTax = 1.2;
        tax = tax + preTax;
        System.out.println("The tax on the fruit is : "+tax);
    }
}
