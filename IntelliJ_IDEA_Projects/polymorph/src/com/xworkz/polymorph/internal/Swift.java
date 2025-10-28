package com.xworkz.polymorph.internal;

public class Swift extends Car{

    public void carDetails(String carName){

        System.out.println("The name of the car is = "+carName);

    }
    public void carDetails(String carName,int price){

        System.out.println("The name of the car is = "+carName);
        System.out.println("The price of the car is = "+price);

    }
    public void carDetails(String carName,int price,long modelNumber){

        System.out.println("The name of the car is = "+carName);
        System.out.println("The price of the car is = "+price);
        System.out.println("The model number of the car is = "+modelNumber);

    }

}
