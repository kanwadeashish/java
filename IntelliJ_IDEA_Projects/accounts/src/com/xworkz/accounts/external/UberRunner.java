package com.xworkz.accounts.external;

import com.xworkz.accounts.dto.Uber;

public class UberRunner {

    public static void main(String[] args) {

        Uber uber = new Uber();

        uber.setAccountName("Nagesh");
        String accountName = uber.getAccountName();
        System.out.println("Account Name = "+accountName);

        uber.setAccountNumber(0);
        int accountNumber = uber.getAccountNumber();
        System.out.println("Account Number = "+accountNumber);

        uber.setAppNumber((byte) 0);
        byte appNumber = uber.getAppNumber();
        System.out.println("App Number = "+appNumber);

        uber.setSerialNumber(00000000L);
        long serialNumber = uber.getSerialNumber();
        System.out.println("Serial Number = "+serialNumber);

        uber.setTotalAccounts((short) 00);
        short totalAccounts = uber.getTotalAccounts();
        System.out.println("Total Acoounts = "+totalAccounts);

        uber.setVersionNumber(0.0);
        double versionNumber = uber.getVersionNumber();
        System.out.println("Version Number = "+versionNumber);

        uber.setAppVersion(0.00f);
        float appVersion = uber.getAppVersion();
        System.out.println("App version = "+appVersion);

        uber.setVersionUpdated(true);
        boolean updated = uber.getVersionUpdated();
        System.out.println("Is version updated = "+updated);

        uber.setUserRating('a');
        char rating = uber.getUserRating();
        System.out.println("Rating = "+rating);

    }

}
