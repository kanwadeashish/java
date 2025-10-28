package com.xworkz.relation.external;

import com.xworkz.relation.internal.Coffee;
import com.xworkz.relation.internal.Sugar;
import com.xworkz.relation.internal.Tea;

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
