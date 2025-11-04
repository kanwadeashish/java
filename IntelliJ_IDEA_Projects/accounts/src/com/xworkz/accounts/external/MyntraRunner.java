package com.xworkz.accounts.external;

import com.xworkz.accounts.dto.Mytra;

public class MyntraRunner {

    public static void main(String[] args) {

        Mytra mytra = new Mytra();

        mytra.setAccountName("Raju");
        String accountName = mytra.getAccountName();
        System.out.println("Account Name = "+accountName);

        mytra.setAccountNumber(5);
        int accountNumber = mytra.getAccountNumber();
        System.out.println("Account Number = "+accountNumber);

        mytra.setAppNumber((byte) 5);
        byte appNumber = mytra.getAppNumber();
        System.out.println("App Number = "+appNumber);

        mytra.setSerialNumber(55555555L);
        long serialNumber = mytra.getSerialNumber();
        System.out.println("Serial Number = "+serialNumber);

        mytra.setTotalAccounts((short) 55);
        short totalAccounts = mytra.getTotalAccounts();
        System.out.println("Total Acoounts = "+totalAccounts);

        mytra.setVersionNumber(5.5);
        double versionNumber = mytra.getVersionNumber();
        System.out.println("Version Number = "+versionNumber);

        mytra.setAppVersion(5.55F);
        float appVersion = mytra.getAppVersion();
        System.out.println("App version = "+appVersion);

        mytra.setVersionUpdated(true);
        boolean updated = mytra.getVersionUpdated();
        System.out.println("Is version updated = "+updated);

        mytra.setUserRating('a');
        char rating = mytra.getUserRating();
        System.out.println("Rating = "+rating);

    }

}
