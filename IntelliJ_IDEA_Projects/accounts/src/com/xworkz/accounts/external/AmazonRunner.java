package com.xworkz.accounts.external;

import com.xworkz.accounts.dto.Amazon;

public class AmazonRunner {

    public static void main(String[] args) {

        Amazon amazon = new Amazon();

        amazon.setAccountName("Suresh");
        String accountName = amazon.getAccountName();
        System.out.println("Account Name = "+accountName);

        amazon.setAccountNumber(7);
        int accountNumber = amazon.getAccountNumber();
        System.out.println("Account Number = "+accountNumber);

        amazon.setAppNumber((byte) 7);
        byte appNumber = amazon.getAppNumber();
        System.out.println("App Number = "+appNumber);

        amazon.setSerialNumber(77777777L);
        long serialNumber = amazon.getSerialNumber();
        System.out.println("Serial Number = "+serialNumber);

        amazon.setTotalAccounts((short) 77);
        short totalAccounts = amazon.getTotalAccounts();
        System.out.println("Total Acoounts = "+totalAccounts);

        amazon.setVersionNumber(7.7);
        double versionNumber = amazon.getVersionNumber();
        System.out.println("Version Number = "+versionNumber);

        amazon.setAppVersion(7.77f);
        float appVersion = amazon.getAppVersion();
        System.out.println("App version = "+appVersion);

        amazon.setVersionUpdated(true);
        boolean updated = amazon.getVersionUpdated();
        System.out.println("Is version updated = "+updated);

        amazon.setUserRating('a');
        char rating = amazon.getUserRating();
        System.out.println("Rating = "+rating);

    }

}
