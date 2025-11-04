package com.xworkz.accounts.external;

import com.xworkz.accounts.dto.Telegram;

public class TelegramRunner {

    public static void main(String[] args) {

        Telegram telegram = new Telegram();

        telegram.setAccountName("Arjun");
        String accountName = telegram.getAccountName();
        System.out.println("Account Name = "+accountName);

        telegram.setAccountNumber(9);
        int accountNumber = telegram.getAccountNumber();
        System.out.println("Account Number = "+accountNumber);

        telegram.setAppNumber((byte) 9);
        byte appNumber = telegram.getAppNumber();
        System.out.println("App Number = "+appNumber);

        telegram.setSerialNumber(99999999L);
        long serialNumber = telegram.getSerialNumber();
        System.out.println("Serial Number = "+serialNumber);

        telegram.setTotalAccounts((short) 99);
        short totalAccounts = telegram.getTotalAccounts();
        System.out.println("Total Acoounts = "+totalAccounts);

        telegram.setVersionNumber(9.9);
        double versionNumber = telegram.getVersionNumber();
        System.out.println("Version Number = "+versionNumber);

        telegram.setAppVersion(9.99f);
        float appVersion = telegram.getAppVersion();
        System.out.println("App version = "+appVersion);

        telegram.setVersionUpdated(true);
        boolean updated = telegram.getVersionUpdated();
        System.out.println("Is version updated = "+updated);

        telegram.setUserRating('a');
        char rating = telegram.getUserRating();
        System.out.println("Rating = "+rating);

    }

}
