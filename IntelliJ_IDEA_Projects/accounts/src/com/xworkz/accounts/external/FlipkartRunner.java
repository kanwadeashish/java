package com.xworkz.accounts.external;

import com.xworkz.accounts.dto.Flipkart;

public class FlipkartRunner {

    public static void main(String[] args) {

        Flipkart flipkart = new Flipkart();

        flipkart.setAccountName("Sammed");
        String accountName = flipkart.getAccountName();
        System.out.println("Account Name = "+accountName);

        flipkart.setAccountNumber(6);
        int accountNumber = flipkart.getAccountNumber();
        System.out.println("Account Number = "+accountNumber);

        flipkart.setAppNumber((byte) 6);
        byte appNumber = flipkart.getAppNumber();
        System.out.println("App Number = "+appNumber);

        flipkart.setSerialNumber(66666666L);
        long serialNumber = flipkart.getSerialNumber();
        System.out.println("Serial Number = "+serialNumber);

        flipkart.setTotalAccounts((short) 66);
        short totalAccounts = flipkart.getTotalAccounts();
        System.out.println("Total Acoounts = "+totalAccounts);

        flipkart.setVersionNumber(6.6);
        double versionNumber = flipkart.getVersionNumber();
        System.out.println("Version Number = "+versionNumber);

        flipkart.setAppVersion(6.66f);
        float appVersion = flipkart.getAppVersion();
        System.out.println("App version = "+appVersion);

        flipkart.setVersionUpdated(true);
        boolean updated = flipkart.getVersionUpdated();
        System.out.println("Is version updated = "+updated);

        flipkart.setUserRating('a');
        char rating = flipkart.getUserRating();
        System.out.println("Rating = "+rating);

    }

}
