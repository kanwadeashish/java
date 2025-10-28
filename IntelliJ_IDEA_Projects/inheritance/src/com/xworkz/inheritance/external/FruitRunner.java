package com.xworkz.inheritance.external;

import com.xworkz.inheritance.internal.Apple;
import com.xworkz.inheritance.internal.Fruit;
import com.xworkz.inheritance.internal.Mango;

public class FruitRunner {

    public static void main(String[] args) {

        Fruit fruit = new Fruit();

        Apple apple = new Apple("Apple");
        apple.appleDetails();

        Mango mango = new Mango("Mange");
        mango.mangoDetails();

    }

}
