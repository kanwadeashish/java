package com.xworkz.excep.internal;

import com.xworkz.excep.exceptions.*;

public class StudentDetails {

    public void showValidityOfAge(int age) throws Exception {
        if (age > 16 && age < 20 ){
            System.out.println("The Age is valid");
        }else {
            throw new InvalidAge();
        }
    }

    public void showValidityOfEmail(String email) throws Exception {
        if (email.contains(".com")){
            System.out.println("The Email is valid");
        }else {
            throw new InvalidEmail();
        }
    }

    public void showValidityOfId(int id) throws Exception {
        if (id> 0){
            System.out.println("The Id is valid");
        }else {
            throw new InvalidId();
        }
    }

    public void showValidityOfName(String name) throws Exception {
        if (name != null){
            System.out.println("The Name is valid");
        }else {
            throw new InvalidName();
        }
    }

    public void showValidityOfPassword(int password) throws Exception {
        if (password != 0){
            System.out.println("The Password is valid");
        }else {
            throw new InvalidPassword();
        }
    }

}
