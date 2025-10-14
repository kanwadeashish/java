package com.xworkz.car.internal;

public abstract class Car {

    public String carName;
    public int carPrice;
    public Engine engine;

    public Car(){

    }

    public Car(String carName,int carPrice,Engine engine){

        this.carName=carName;
        this.carPrice=carPrice;
        this.engine=engine;

    }
    public abstract void displayCarDetails();

    public void carDeatils(){

        System.out.println("The Name of the car is = "+carName);
        System.out.println("The price of the car is = "+carPrice);
        System.out.println("The details of engine = "+engine.engineBrand);

    }
}
