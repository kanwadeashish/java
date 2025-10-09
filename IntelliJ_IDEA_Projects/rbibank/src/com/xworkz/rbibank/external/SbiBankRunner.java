package com.xworkz.rbibank.external;

import com.xworkz.rbibank.internal.SbiBank;

public class SbiBankRunner {

    public static void main(String[] args) {

        SbiBank sbi = new SbiBank("State Bank of India",9.8);
        sbi.showBankName();
        sbi.showInterestRate();

    }

}
