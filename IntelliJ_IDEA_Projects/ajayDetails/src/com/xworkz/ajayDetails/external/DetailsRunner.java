package com.xworkz.ajayDetails.external;

import com.xworkz.ajayDetails.internal.Details;

public class DetailsRunner {

    public static void main(String[] args) {

        Details details = new Details();

        int id1 = details.idDetails(1);
        System.out.println(id1);
        int id2 = details.idDetails(-1);
        System.out.println(id2);

        String course1 = details.courseDetails("CS");
        System.out.println(course1);
        String course2 = details.courseDetails("EC");
        System.out.println(course2);

        int age1 = details.ageDetails(18);
        System.out.println(age1);
        int age2 = details.ageDetails(-18);
        System.out.println(age2);

        String mail1 = details.mailDetails("abcd.com");
        System.out.println(mail1);
        String mail2 = details.mailDetails("abcd.in");
        System.out.println(mail2);

        String name1 = details.nameDetails("Ajay");
        System.out.println(name1);
        String name2 = details.nameDetails("");
        System.out.println(name2);

    }

}
