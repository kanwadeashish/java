package com.xworkz.encap.external;

import com.xworkz.encap.dto.JohnDto;

public class JohnDtoRunner {

    public static void main(String[] args) {

        JohnDto johnDto = new JohnDto(5,"John",1234567890L,95.95,'a',true);

        String details = johnDto.toString();
        System.out.println(details);


    }

}
