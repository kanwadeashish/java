package com.xworkz.rbibank.external;

import com.xworkz.rbibank.internal.HDFCBank;

public class HDFCBankRunner {

    public static void main(String[] args) {

        HDFCBank hdfc = new HDFCBank("HDFC",6.7);

        hdfc.showBankName();
        hdfc.showInterestRate();

    }

}
