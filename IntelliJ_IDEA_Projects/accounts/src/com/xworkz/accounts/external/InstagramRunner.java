package com.xworkz.accounts.external;

import com.xworkz.accounts.dto.Instagram;

public class InstagramRunner {

    public static void main(String[] args) {

        Instagram instagram = new Instagram();

        instagram.setAccountName("Vijay");
        String accountName = instagram.getAccountName();
        System.out.println("Account Name = "+accountName);

        instagram.setAccountNumber(3);
        int accountNumber = instagram.getAccountNumber();
        System.out.println("Account Number = "+accountNumber);

        instagram.setAppNumber((byte) 3);
        byte appNumber = instagram.getAppNumber();
        System.out.println("App Number = "+appNumber);

        instagram.setSerialNumber(33333333L);
        long serialNumber = instagram.getSerialNumber();
        System.out.println("Serial Number = "+serialNumber);

        instagram.setTotalAccounts((short) 33);
        short totalAccounts = instagram.getTotalAccounts();
        System.out.println("Total Acoounts = "+totalAccounts);

        instagram.setVersionNumber(3.3);
        double versionNumber = instagram.getVersionNumber();
        System.out.println("Version Number = "+versionNumber);

        instagram.setAppVersion(3.33f);
        float appVersion = instagram.getAppVersion();
        System.out.println("App version = "+appVersion);

        instagram.setVersionUpdated(true);
        boolean updated = instagram.getVersionUpdated();
        System.out.println("Is version updated = "+updated);

        instagram.setUserRating('a');
        char rating = instagram.getUserRating();
        System.out.println("Rating = "+rating);

    }

}
