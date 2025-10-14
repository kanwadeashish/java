package com.xworkz.car.internal;

public class Engine {

    public String engineBrand;
    public int engineValves;

    public Engine(String engineBrand,int engineValves){

        this.engineBrand=engineBrand;
        this.engineValves=engineValves;

    }

    public void displayEngineDetails(){

        System.out.println("The brand of the engine is = "+engineBrand);
        System.out.println("The valves in the engine are = "+engineValves);

    }

}
