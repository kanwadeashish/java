package com.xworkz.accounts.dto;

public class Uber {

    private String  accountName;
    private int accountNumber;
    private byte appNumber;
    private long serialNumber;
    private short totalAccounts;
    private double versionNumber;
    private float appVersion;
    private boolean isVersionUpdated;
    private char userRating;

    public void setAccountName(String accountName){
        this.accountName=accountName;
    }
    public String getAccountName(){
        return accountName;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAppNumber(byte appNumber){
        this.appNumber=appNumber;
    }
    public byte getAppNumber(){
        return appNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }
    public long getSerialNumber() {
        return serialNumber;
    }

    public void setTotalAccounts(short totalAccounts) {
        this.totalAccounts = totalAccounts;
    }
    public short getTotalAccounts() {
        return totalAccounts;
    }

    public void setVersionNumber(double versionNumber) {
        this.versionNumber = versionNumber;
    }
    public double getVersionNumber() {
        return versionNumber;
    }

    public void setAppVersion(float appVersion) {
        this.appVersion = appVersion;
    }
    public float getAppVersion() {
        return appVersion;
    }

    public void setVersionUpdated(boolean versionUpdated) {
        isVersionUpdated = versionUpdated;
    }
    public boolean getVersionUpdated() {
        return isVersionUpdated;
    }

    public void setUserRating(char userRating) {
        this.userRating = userRating;
    }
    public char getUserRating() {
        return userRating;
    }

}
