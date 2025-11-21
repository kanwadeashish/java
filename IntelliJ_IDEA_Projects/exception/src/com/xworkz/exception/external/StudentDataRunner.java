package com.xworkz.exception.external;

import com.xworkz.exception.internal.StudentData;

public class StudentDataRunner {

    public static void main(String[] args) throws Exception {

        StudentData data = new StudentData(30,"Ajay");
        data.showData();

    }

}
