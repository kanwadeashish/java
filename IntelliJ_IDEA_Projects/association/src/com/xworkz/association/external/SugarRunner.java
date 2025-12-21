package com.xworkz.association.external;

import com.xworkz.association.internal.Coffee;
import com.xworkz.association.internal.Sugar;
import com.xworkz.association.internal.Tea;

public class SugarRunner {

    public static void main(String[] args) {

        Sugar teaSugar = new Sugar("Tata",3);
        Sugar coffeeSugar = new Sugar("Nector",2);

        Tea tea = new Tea(20,teaSugar);
        tea.teaDetails();

        Coffee coffee = new Coffee(30,coffeeSugar);
        coffee.coffeeDetails();

    }

}
