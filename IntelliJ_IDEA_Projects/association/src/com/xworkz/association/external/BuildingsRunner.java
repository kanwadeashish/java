package com.xworkz.association.external;

import com.xworkz.association.internal.*;

public class BuildingsRunner {

    public static void main(String[]args){

        Cement cementForSchool = new Cement(20000);
        Cement cementForHouse = new Cement(10000);
        Cement cementForApartment = new Cement(30000);

        Sand sandForSchool = new Sand(200);
        Sand sandForHouse = new Sand(100);
        Sand sandForApartment = new Sand(300);

        Bricks bricksForSchool = new Bricks(22222);
        Bricks bricksForHouse = new Bricks(11111);
        Bricks bricksForApartment = new Bricks(33333);

        School school = new School("School",cementForSchool,sandForSchool,bricksForSchool);

        House house = new House("House",cementForHouse,sandForHouse,bricksForHouse);

        Apartment apartment = new Apartment("Apartment",cementForApartment,sandForApartment,bricksForApartment);

        school.displaySchoolBuildingInfo();
        house.displayHouseBuildingInfo();
        apartment.displayApartmentBuildingInfo();

    }

}
