package com.xworkz.encap.external;

import com.xworkz.encap.dto.VijayDto;

public class VijayDtoRunner {

    public static void main(String[] args) {

        VijayDto vijayDto = new VijayDto(2,"Vijay",1234567890L,98.98,'a',true);

        String details = vijayDto.toString();
        System.out.println(details);


    }

}
