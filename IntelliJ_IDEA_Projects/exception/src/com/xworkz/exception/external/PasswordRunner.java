package com.xworkz.exception.external;

import com.xworkz.exception.exceptions.InvalidPassword;
import com.xworkz.exception.internal.Password;

public class PasswordRunner {

    public static void main(String[] args) throws Exception {

        Password password = new Password();
        password.showValidityOfPassword(123456789);

    }

}
