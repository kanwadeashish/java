package com.xworkz.accounts.external;

import com.xworkz.accounts.dto.Youtube;

public class YoutubeRunner {

    public static void main(String[] args) {

        Youtube youtube = new Youtube();

        youtube.setAccountName("Karan");
        String accountName = youtube.getAccountName();
        System.out.println("Account Name = "+accountName);

        youtube.setAccountNumber(8);
        int accountNumber = youtube.getAccountNumber();
        System.out.println("Account Number = "+accountNumber);

        youtube.setAppNumber((byte) 8);
        byte appNumber = youtube.getAppNumber();
        System.out.println("App Number = "+appNumber);

        youtube.setSerialNumber(88888888L);
        long serialNumber = youtube.getSerialNumber();
        System.out.println("Serial Number = "+serialNumber);

        youtube.setTotalAccounts((short) 88);
        short totalAccounts = youtube.getTotalAccounts();
        System.out.println("Total Acoounts = "+totalAccounts);

        youtube.setVersionNumber(8.8);
        double versionNumber = youtube.getVersionNumber();
        System.out.println("Version Number = "+versionNumber);

        youtube.setAppVersion(8.88f);
        float appVersion = youtube.getAppVersion();
        System.out.println("App version = "+appVersion);

        youtube.setVersionUpdated(true);
        boolean updated = youtube.getVersionUpdated();
        System.out.println("Is version updated = "+updated);

        youtube.setUserRating('a');
        char rating = youtube.getUserRating();
        System.out.println("Rating = "+rating);

    }

}
