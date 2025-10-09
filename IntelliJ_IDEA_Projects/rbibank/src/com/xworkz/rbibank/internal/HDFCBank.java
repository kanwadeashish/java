package com.xworkz.rbibank.internal;

public class HDFCBank extends RbiBank{

    public String bankName;
    public double interestRate;

    public HDFCBank(String bankName, double interestRate){

        this.bankName=bankName;
        this.interestRate=interestRate;

    }

    @Override
    public void showBankName() {
        System.out.println("The name of the bank is = "+bankName);
    }

    @Override
    public void showInterestRate() {
        System.out.println("The interest rate in the bank is = "+interestRate);
    }

}
