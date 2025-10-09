package com.xworkz.rbibank.external;

import com.xworkz.rbibank.internal.KotakBank;

public class KotakBankRunner {

    public static void main(String[] args) {

        KotakBank kotak = new KotakBank("Kotak",7.5);
        kotak.showBankName();
        kotak.showInterestRate();

    }

}
