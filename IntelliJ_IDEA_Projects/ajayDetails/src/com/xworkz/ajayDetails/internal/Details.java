package com.xworkz.ajayDetails.internal;

import com.xworkz.ajayDetails.events.*;

public class Details {

    public int idDetails(int id){
        if (id > 0){
            System.out.println("the id is correct.");
            return id;
        }else {
            try {
                throw new IncorrectId();
            }catch (IncorrectId incorrectId){
                incorrectId.printStackTrace();
                return id;
            }
        }
    }

    public String courseDetails(String courseName){
        if (courseName=="CS"){
            System.out.println("The given course is correct");
            return courseName;
        }else {
            try {
                throw new IncorretCourse();
            }catch (IncorretCourse incorretCourse){
                incorretCourse.printStackTrace();
                return courseName;
            }
        }
    }

    public int ageDetails(int age){
        if (age>0){
            System.out.println("the given age is correct");
            return age;
        }else {
            try {
                throw new InvalidAge();
            }catch (InvalidAge invalidAge){
                invalidAge.printStackTrace();
                return age;
            }
        }
    }

    public String mailDetails(String mail){
        if (mail.contains(".com")){
            System.out.println("The mail is correct");
            return mail;
        }else {
            try {
                throw new InvalidMail();
            }catch (InvalidMail invalidMail){
                invalidMail.printStackTrace();
                return mail;
            }
        }
    }

    public String nameDetails(String name){
        if (name.isEmpty()){
            try {
                throw new InvalidName();
            }catch (InvalidName invalidName){
                invalidName.printStackTrace();
                return name;
            }
        }else {
            System.out.println("The name is valid");
            return name;
        }
    }

}
