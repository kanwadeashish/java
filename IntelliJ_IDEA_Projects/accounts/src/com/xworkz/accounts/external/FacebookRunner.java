package com.xworkz.accounts.external;

import com.xworkz.accounts.dto.Facebook;

public class FacebookRunner {

    public static void main(String[] args) {

        Facebook facebook = new Facebook();

        facebook.setAccountName("Ajay");
        String accountName = facebook.getAccountName();
        System.out.println("Account Name = "+accountName);

        facebook.setAccountNumber(1);
        int accountNumber = facebook.getAccountNumber();
        System.out.println("Account Number = "+accountNumber);

        facebook.setAppNumber((byte) 1);
        byte appNumber = facebook.getAppNumber();
        System.out.println("App Number = "+appNumber);

        facebook.setSerialNumber(11111111L);
        long serialNumber = facebook.getSerialNumber();
        System.out.println("Serial Number = "+serialNumber);

        facebook.setTotalAccounts((short) 11);
        short totalAccounts = facebook.getTotalAccounts();
        System.out.println("Total Acoounts = "+totalAccounts);

        facebook.setVersionNumber(1.1);
        double versionNumber = facebook.getVersionNumber();
        System.out.println("Version Number = "+versionNumber);

        facebook.setAppVersion(1.11f);
        float appVersion = facebook.getAppVersion();
        System.out.println("App version = "+appVersion);

        facebook.setVersionUpdated(true);
        boolean updated = facebook.getVersionUpdated();
        System.out.println("Is version updated = "+updated);

        facebook.setUserRating('a');
        char rating = facebook.getUserRating();
        System.out.println("Rating = "+rating);

    }

}
