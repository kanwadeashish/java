package com.xworkz.car.internal;

public class Maruti extends Car{

    public String carModel;

    public Maruti(String carModel){

        this.carModel=carModel;

    }

    public Maruti(String carName,int carPrice,Engine engine){

        super(carName,carPrice,engine);
        super.carName=carName;
        super.carPrice=carPrice;
        super.engine=engine;

    }

    @Override
    public void displayCarDetails() {
        System.out.println("The model of the car is = "+carModel);
    }
}
