package com.xworkz.collection.dto;

import java.util.Objects;

public class ScooterDto {

    private String brandName;
    private int scooterNumber;
    private byte scooterId;
    private short scooterCode;
    private long scooterSerialNumber;
    private double tax;
    private float discount;
    private char scooterRating;
    private boolean isComfortable;

    public ScooterDto(String brandName, int scooterNumber, byte scooterId, short scooterCode, long scooterSerialNumber, double tax, float discount, char scooterRating, boolean isComfortable) {
        this.brandName = brandName;
        this.scooterNumber = scooterNumber;
        this.scooterId = scooterId;
        this.scooterCode = scooterCode;
        this.scooterSerialNumber = scooterSerialNumber;
        this.tax = tax;
        this.discount = discount;
        this.scooterRating = scooterRating;
        this.isComfortable = isComfortable;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getScooterNumber() {
        return scooterNumber;
    }

    public void setScooterNumber(int scooterNumber) {
        this.scooterNumber = scooterNumber;
    }

    public byte getScooterId() {
        return scooterId;
    }

    public void setScooterId(byte scooterId) {
        this.scooterId = scooterId;
    }

    public short getScooterCode() {
        return scooterCode;
    }

    public void setScooterCode(short scooterCode) {
        this.scooterCode = scooterCode;
    }

    public long getScooterSerialNumber() {
        return scooterSerialNumber;
    }

    public void setScooterSerialNumber(long scooterSerialNumber) {
        this.scooterSerialNumber = scooterSerialNumber;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public char getScooterRating() {
        return scooterRating;
    }

    public void setScooterRating(char scooterRating) {
        this.scooterRating = scooterRating;
    }

    public boolean isComfortable() {
        return isComfortable;
    }

    public void setComfortable(boolean comfortable) {
        isComfortable = comfortable;
    }

    @Override
    public String toString() {
        return "ScooterDto{" +
                "brandName='" + brandName + '\'' +
                ", scooterNumber=" + scooterNumber +
                ", scooterId=" + scooterId +
                ", scooterCode=" + scooterCode +
                ", scooterSerialNumber=" + scooterSerialNumber +
                ", tax=" + tax +
                ", discount=" + discount +
                ", scooterRating=" + scooterRating +
                ", isComfortable=" + isComfortable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScooterDto that = (ScooterDto) o;
        return scooterNumber == that.scooterNumber && scooterId == that.scooterId && scooterCode == that.scooterCode && scooterSerialNumber == that.scooterSerialNumber && Double.compare(tax, that.tax) == 0 && Float.compare(discount, that.discount) == 0 && scooterRating == that.scooterRating && isComfortable == that.isComfortable && Objects.equals(brandName, that.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, scooterNumber, scooterId, scooterCode, scooterSerialNumber, tax, discount, scooterRating, isComfortable);
    }
}
