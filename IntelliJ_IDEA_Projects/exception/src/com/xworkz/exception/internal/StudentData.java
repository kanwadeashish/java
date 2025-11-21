package com.xworkz.exception.internal;

import com.xworkz.exception.exceptions.InvalidAge;

public class StudentData {

    public int age;
    public String name;

    public StudentData(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void showData() throws Exception{
        if (age<0 || age>25){
            throw new InvalidAge();
        }
        else {
            System.out.println("The age is valod");
        }

    }

}
