package com.xworkz.encap.external;

import com.xworkz.encap.dto.AjayDto;

public class AjayDtoRunner {

    public static void main(String[] args) {

        AjayDto ajayDto = new AjayDto(1,"Ajay",1234567890L,99.99,'a',true);

        String details = ajayDto.toString();
        System.out.println(details);


    }

}
