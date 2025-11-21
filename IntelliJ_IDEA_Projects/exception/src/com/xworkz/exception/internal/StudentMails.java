package com.xworkz.exception.internal;

import com.xworkz.exception.exceptions.InvalidEmail;

public class StudentMails {

    String mail;

    public StudentMails(String mail) {
        this.mail = mail;
    }

    public void showMail() throws Exception{
        if (mail.contains(".com")){
            System.out.println("The mail is valid");
        }else {
            throw new InvalidEmail();
        }
    }

}
