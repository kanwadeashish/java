package com.xworkz.polymorphism.overloading;

public class HarryDetails {

    public void studentDetails(int id){
        System.out.println("Students Id is = "+id);
    }

    public void studentDetails(String name){
        studentDetails(5);
        System.out.println("Students Name is = "+name);
    }

    public void studentDetails(double percentage){
        studentDetails("Harry");
        System.out.println("Students percentage is = "+percentage);
    }

    public void studentDetails(boolean isEligible){
        studentDetails(99.99);
        System.out.println("Is students percentage above 80 = "+isEligible);
    }

    public void studentDetails(char rating){
        studentDetails(true);
        System.out.println("Students rating is = "+rating);
    }

    public static void main(String[] args) {

        HarryDetails details = new HarryDetails();

        details.studentDetails('a');

    }

}
