package com.xworkz.polymorphism.overloading;

public class JohnDetails {

    public void studentDetails(int id){
        System.out.println("Students Id is = "+id);
    }

    public void studentDetails(String name){
        studentDetails(4);
        System.out.println("Students Name is = "+name);
    }

    public void studentDetails(double percentage){
        studentDetails("John");
        System.out.println("Students percentage is = "+percentage);
    }

    public void studentDetails(boolean isEligible){
        studentDetails(79.79);
        System.out.println("Is students percentage above 80 = "+isEligible);
    }

    public void studentDetails(char rating){
        studentDetails(false);
        System.out.println("Students rating is = "+rating);
    }

    public static void main(String[] args) {

        JohnDetails details = new JohnDetails();

        details.studentDetails('b');

    }

}
