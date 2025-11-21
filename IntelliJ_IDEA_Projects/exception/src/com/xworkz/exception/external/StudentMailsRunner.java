package com.xworkz.exception.external;

import com.xworkz.exception.internal.StudentMails;

public class StudentMailsRunner {

    public static void main(String[] args) throws Exception {

        StudentMails mails = new StudentMails("abc@gmail");
        mails.showMail();

    }

}
