package com.xworkz.vehicles.external;

import com.xworkz.vehicles.internal.Mahindra;
import com.xworkz.vehicles.internal.VehicleCompany;

public class MahindraRunner {

    public static void main(String[] args) {

        VehicleCompany company = new Mahindra("Mahindra",5000000);
        Mahindra mahindra = (Mahindra) company ;
        mahindra.showCompanyName();
        mahindra.showVehiclePrice();

    }

}
