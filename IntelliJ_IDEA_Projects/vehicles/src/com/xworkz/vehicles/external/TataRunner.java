package com.xworkz.vehicles.external;

import com.xworkz.vehicles.internal.Tata;
import com.xworkz.vehicles.internal.VehicleCompany;

public class TataRunner {

    public static void main(String[] args) {

        VehicleCompany company = new Tata("Tata",1200000);
        Tata tata = (Tata)company ;
        tata.showCompanyName();
        tata.showVehiclePrice();

    }

}
