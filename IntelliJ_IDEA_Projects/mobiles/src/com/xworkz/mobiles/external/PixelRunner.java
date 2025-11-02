package com.xworkz.mobiles.external;

import com.xworkz.mobiles.bridge.Pixel;
import com.xworkz.mobiles.bridge.PixelInfo;

public class PixelRunner {

    public static void main(String[] args) {

        Pixel pixel = new PixelInfo();
        String name = pixel.brandName("Pixel");
        System.out.println(name);

    }

}
