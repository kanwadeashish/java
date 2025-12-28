package com.xworkz.encap.external;

import com.xworkz.encap.dto.SujayDto;

public class SujayDtoRunner {

    public static void main(String[] args) {

        SujayDto sujayDto = new SujayDto(3,"Sujay",1234567890L,97.97,'a',true);

        String details = sujayDto.toString();
        System.out.println(details);


    }

}
