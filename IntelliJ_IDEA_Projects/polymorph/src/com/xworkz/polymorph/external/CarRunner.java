package com.xworkz.polymorph.external;

import com.xworkz.polymorph.internal.Swift;
import com.xworkz.polymorph.internal.Thar;

public class CarRunner {

    public static void main(String[] args) {

        Thar thar = new Thar("Thar");
        thar.carDetails();

        Swift swift = new Swift();
        swift.carDetails("Swifr");
        swift.carDetails("Swifr",1200000);
        swift.carDetails("Swifr",1200000,123456789L);

    }

}
