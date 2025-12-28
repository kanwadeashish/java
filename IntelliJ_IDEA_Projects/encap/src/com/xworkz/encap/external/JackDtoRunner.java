package com.xworkz.encap.external;

import com.xworkz.encap.dto.JackDto;

public class JackDtoRunner {

    public static void main(String[] args) {

        JackDto jackDto = new JackDto(4,"Jack",1234567890L,96.96,'a',true);

        String details = jackDto.toString();
        System.out.println(details);


    }

}
