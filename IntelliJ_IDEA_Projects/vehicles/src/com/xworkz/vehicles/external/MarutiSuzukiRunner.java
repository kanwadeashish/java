package com.xworkz.vehicles.external;

import com.xworkz.vehicles.internal.MarutiSuzuki;
import com.xworkz.vehicles.internal.VehicleCompany;

public class MarutiSuzukiRunner {

    public static void main(String[] args) {

        VehicleCompany company = new MarutiSuzuki("Maruti Suzuki",300000);
        MarutiSuzuki maruti = (MarutiSuzuki) company;
        maruti.showCompanyName();
        maruti.showVehiclePrice();

    }

}
