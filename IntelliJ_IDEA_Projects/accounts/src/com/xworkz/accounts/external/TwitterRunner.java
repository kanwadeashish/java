package com.xworkz.accounts.external;

import com.xworkz.accounts.dto.Twitter;

public class TwitterRunner {

    public static void main(String[] args) {

        Twitter twitter = new Twitter();

        twitter.setAccountName("Sujay");
        String accountName = twitter.getAccountName();
        System.out.println("Account Name = "+accountName);

        twitter.setAccountNumber(2);
        int accountNumber = twitter.getAccountNumber();
        System.out.println("Account Number = "+accountNumber);

        twitter.setAppNumber((byte) 2);
        byte appNumber = twitter.getAppNumber();
        System.out.println("App Number = "+appNumber);

        twitter.setSerialNumber(22222222L);
        long serialNumber = twitter.getSerialNumber();
        System.out.println("Serial Number = "+serialNumber);

        twitter.setTotalAccounts((short) 22);
        short totalAccounts = twitter.getTotalAccounts();
        System.out.println("Total Acoounts = "+totalAccounts);

        twitter.setVersionNumber(2.2);
        double versionNumber = twitter.getVersionNumber();
        System.out.println("Version Number = "+versionNumber);

        twitter.setAppVersion(2.22f);
        float appVersion = twitter.getAppVersion();
        System.out.println("App version = "+appVersion);

        twitter.setVersionUpdated(true);
        boolean updated = twitter.getVersionUpdated();
        System.out.println("Is version updated = "+updated);

        twitter.setUserRating('a');
        char rating = twitter.getUserRating();
        System.out.println("Rating = "+rating);

    }

}
