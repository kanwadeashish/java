package com.xworkz.polymorphism.overloading;

public class VijayDetails {

    public void studentDetails(int id){
        System.out.println("Students Id is = "+id);
    }

    public void studentDetails(String name){
        studentDetails(2);
        System.out.println("Students Name is = "+name);
    }

    public void studentDetails(double percentage){
        studentDetails("Vijay");
        System.out.println("Students percentage is = "+percentage);
    }

    public void studentDetails(boolean isEligible){
        studentDetails(88.88);
        System.out.println("Is students percentage above 80 = "+isEligible);
    }

    public void studentDetails(char rating){
        studentDetails(true);
        System.out.println("Students rating is = "+rating);
    }

    public static void main(String[] args) {

        VijayDetails details = new VijayDetails();

        details.studentDetails('a');

    }

}
