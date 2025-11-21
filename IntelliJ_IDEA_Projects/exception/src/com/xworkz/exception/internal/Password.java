package com.xworkz.exception.internal;

import com.xworkz.exception.exceptions.InvalidPassword;

public class Password {

    public int passwprd = 123456789;

    public void showValidityOfPassword(int passwprd) throws Exception {
        if (passwprd==this.passwprd){
            System.out.println("The password is valid");
        }else {
            throw new InvalidPassword();
        }
    }

}
