package com.xworkz.car.external;

import com.xworkz.car.internal.Car;
import com.xworkz.car.internal.Engine;
import com.xworkz.car.internal.Maruti;

public class CarRunner {

    public static void main(String[] args) {

        Car car = new Maruti("Swift");
        Engine engine = new Engine("Maruti",8);
        Car maruti = new Maruti("Maruti swift",1200000,engine);
        maruti.carDeatils();
        engine.displayEngineDetails();
        car.displayCarDetails();

    }

}
