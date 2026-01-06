package com.xworkz.jdbcDto.external;

import com.xworkz.jdbcDto.dto.AjayDto;
import com.xworkz.jdbcDto.internal.AjayDetails;

public class AjayRunner {

    public static void main(String[] args) {

        AjayDto dto = new AjayDto(1,"Ajay", (short) 01,1234567890L,99.99,98.98F,true,'a');

        AjayDetails details = new AjayDetails();

        int print = details.addAjayDetails(dto);
        System.out.println(print);
    }

}
