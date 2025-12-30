package com.xworkz.excep.external;

import com.xworkz.excep.internal.StudentDetails;

public class StudentDetailsRunner {

    public static void main(String[] args) throws Exception {

        StudentDetails studentDetails = new StudentDetails();

        studentDetails.showValidityOfAge(18);
        studentDetails.showValidityOfEmail("abcd@gmail.com");
        studentDetails.showValidityOfId(1);
        studentDetails.showValidityOfName("Ajay");
        studentDetails.showValidityOfPassword(123456789);

    }

}
