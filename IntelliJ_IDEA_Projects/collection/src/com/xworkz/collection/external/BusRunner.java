package com.xworkz.collection.external;

import com.xworkz.collection.dto.BusDto;

import java.util.LinkedList;
import java.util.List;

public class BusRunner {

    public static void main(String[] args) {

        List<BusDto> list = new LinkedList<>();

        list.add(new BusDto("BMW",1, (byte) 11, (short) 111,111111111L,1.1,10.10f,'a',true));
        list.add(new BusDto("Mercedes",2, (byte) 12, (short) 112,111111112L,1.2,11.10f,'b',false));
        list.add(new BusDto("Maruti",3, (byte) 13, (short) 121,111111113L,1.3,12.10f,'c',true));
        list.add(new BusDto("Oudi",4, (byte) 14, (short) 211,111111114L,1.4,13.10f,'d',false));
        list.add(new BusDto("Tata",5, (byte) 15, (short) 122,111111115L,1.5,14.10f,'e',true));
        list.add(new BusDto("Mahindra",6, (byte) 16, (short) 221,111111116L,1.6,15.10f,'f',false));
        list.add(new BusDto("Toyoto",7, (byte) 17, (short) 212,111111117L,1.7,16.10f,'g',true));
        list.add(new BusDto("Bently",8, (byte) 18, (short) 113,111111118L,1.8,17.10f,'h',false));
        list.add(new BusDto("Abarth",9, (byte) 19, (short) 131,111111119L,1.9,18.10f,'i',true));
        list.add(new BusDto("AC",10, (byte) 20, (short) 311,111111110L,2.0,19.10f,'j',false));
        list.add(new BusDto("AK",11, (byte) 21, (short) 313,111111121L,2.1,20.10f,'k',true));
        list.add(new BusDto("Alfa Romeo",12, (byte) 22, (short) 133,111111122L,2.2,21.10f,'l',false));
        list.add(new BusDto("Allard",13, (byte) 23, (short) 331,111111123L,2.3,22.10f,'m',true));
        list.add(new BusDto("Alpine",14, (byte) 24, (short) 123,111111124L,2.4,23.10f,'n',false));
        list.add(new BusDto("Alvis",15, (byte) 25, (short) 321,111111125L,2.5,24.10f,'o',true));
        list.add(new BusDto("Ariel",16, (byte) 26, (short) 213,111111126L,2.6,25.10f,'p',false));
        list.add(new BusDto("Aston Martin",17, (byte) 27, (short) 312,111111127L,2.7,26.10f,'q',true));
        list.add(new BusDto("Austin",18, (byte) 28, (short) 114,111111128L,2.8,27.10f,'r',false));
        list.add(new BusDto("BAC",19, (byte) 29, (short) 141,111111129L,2.9,28.10f,'s',true));
        list.add(new BusDto("Beauford",20, (byte) 30, (short) 411,111111130L,3.0,29.10f,'t',false));
        list.add(new BusDto("Bowler",21, (byte) 31, (short) 144,111111131L,3.1,30.10f,'u',true));
        list.add(new BusDto("Bramwith",22, (byte) 32, (short) 441,111111132L,3.2,31.10f,'v',false));
        list.add(new BusDto("Bugatti",23, (byte) 33, (short) 414,111111133L,3.3,32.10f,'w',true));
        list.add(new BusDto("Buick",24, (byte) 34, (short) 421,111111134L,3.4,33.10f,'x',false));
        list.add(new BusDto("BYD",25, (byte) 35, (short) 124,111111135L,3.5,34.10f,'y',true));
        list.add(new BusDto("Cadillac",26, (byte) 36, (short) 431,111111136L,3.6,35.10f,'z',false));
        list.add(new BusDto("Caterham",27, (byte) 37, (short) 134,111111137L,3.7,36.10f,'a',true));
        list.add(new BusDto("CFMOTO",28, (byte) 38, (short) 432,111111138L,3.8,37.10f,'b',false));
        list.add(new BusDto("Changan",29, (byte) 39, (short) 234,111111139L,3.9,38.10f,'c',true));
        list.add(new BusDto("Chevrolet",30, (byte) 40, (short) 214,111111140L,4.0,39.10f,'d',false));
        list.add(new BusDto("Chevrolet",30, (byte) 40, (short) 214,111111140L,4.0,39.10f,'d',false));

        list.forEach(n-> System.out.println(n));

        for (BusDto bus : list){
            System.out.println("bus Name : "+bus.getBusName()+
                    " bus Number : "+bus.getBusNumber()+
                    " bus Id : "+bus.getBusId()+
                    " bus Code : "+bus.getBusCode()+
                    " Serial Number : "+bus.getBusSerialNumber()+
                    " Tax : " +bus.getTax()+
                    " Discount : "+bus.getDiscount()+
                    " bus Rating : "+bus.getBusRating()+
                    " Is bus Electric : "+bus.isElectric());
        }

    }

}
