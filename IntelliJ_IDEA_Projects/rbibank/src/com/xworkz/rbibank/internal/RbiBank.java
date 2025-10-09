package com.xworkz.rbibank.internal;

public abstract class RbiBank {

    public RbiBank(){

        System.out.println("The constructor in the parent abstract class.");

    }

    public abstract void showBankName();

    public abstract void showInterestRate();

}
