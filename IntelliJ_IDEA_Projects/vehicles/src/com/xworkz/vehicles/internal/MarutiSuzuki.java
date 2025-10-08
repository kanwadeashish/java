package com.xworkz.vehicles.internal;

public class MarutiSuzuki extends VehicleCompany{

    public String companyName;
    public int vehiclePrice;

    public MarutiSuzuki(String companyName, int vehiclePrice){

        this.companyName=companyName;
        this.vehiclePrice=vehiclePrice;

    }

    public void showCompanyName(){

        System.out.println("The name of the vehicle company is = "+companyName);

    }
    public void showVehiclePrice(){

        System.out.println("The price of the vehicle is = "+vehiclePrice);

    }

}
