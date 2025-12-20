package com.xworkz.polymorphism.overloading;

public class AjayDetails {

    public void studentDetails(int id){
        System.out.println("Students Id is = "+id);
    }

    public void studentDetails(String name){
        studentDetails(1);
        System.out.println("Students Name is = "+name);
    }

    public void studentDetails(double percentage){
        studentDetails("Ajay");
        System.out.println("Students percentage is = "+percentage);
    }

    public void studentDetails(boolean isEligible){
        studentDetails(80.80);
        System.out.println("Is students percentage above 80 = "+isEligible);
    }

    public void studentDetails(char rating){
        studentDetails(true);
        System.out.println("Students rating is = "+rating);
    }

    public static void main(String[] args) {

        AjayDetails details = new AjayDetails();

        details.studentDetails('a');

    }

}
