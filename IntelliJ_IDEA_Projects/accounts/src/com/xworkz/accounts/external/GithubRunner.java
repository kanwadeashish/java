package com.xworkz.accounts.external;

import com.xworkz.accounts.dto.Github;

public class GithubRunner {

    public static void main(String[] args) {

        Github github = new Github();

        github.setAccountName("Ganesh");
        String accountName = github.getAccountName();
        System.out.println("Account Name = "+accountName);

        github.setAccountNumber(4);
        int accountNumber = github.getAccountNumber();
        System.out.println("Account Number = "+accountNumber);

        github.setAppNumber((byte) 4);
        byte appNumber = github.getAppNumber();
        System.out.println("App Number = "+appNumber);

        github.setSerialNumber(44444444L);
        long serialNumber = github.getSerialNumber();
        System.out.println("Serial Number = "+serialNumber);

        github.setTotalAccounts((short) 44);
        short totalAccounts = github.getTotalAccounts();
        System.out.println("Total Acoounts = "+totalAccounts);

        github.setVersionNumber(4.4);
        double versionNumber = github.getVersionNumber();
        System.out.println("Version Number = "+versionNumber);

        github.setAppVersion(4.44f);
        float appVersion = github.getAppVersion();
        System.out.println("App version = "+appVersion);

        github.setVersionUpdated(true);
        boolean updated = github.getVersionUpdated();
        System.out.println("Is version updated = "+updated);

        github.setUserRating('a');
        char rating = github.getUserRating();
        System.out.println("Rating = "+rating);

    }

}
