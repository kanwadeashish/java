package com.xworkz.polymorph.internal;

public class Thar extends Car{

    public String carName;

    public Thar(String carName){

        this.carName=carName;

    }

    public void carDetails(){

        System.out.println("The name of the car is = "+carName);

    }
}
