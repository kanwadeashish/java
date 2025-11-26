package com.xworkz.collection.dto;

import java.util.Objects;

public class MopedDto {

    private String brandName;
    private int mopedNumber;
    private byte mopedId;
    private short mopedCode;
    private long mopedSerialNumber;
    private double tax;
    private float discount;
    private char mopedRating;
    private boolean isComfortable;

    public MopedDto(String brandName, int mopedNumber, byte mopedId, short mopedCode, long mopedSerialNumber, double tax, float discount, char mopedRating, boolean isComfortable) {
        this.brandName = brandName;
        this.mopedNumber = mopedNumber;
        this.mopedId = mopedId;
        this.mopedCode = mopedCode;
        this.mopedSerialNumber = mopedSerialNumber;
        this.tax = tax;
        this.discount = discount;
        this.mopedRating = mopedRating;
        this.isComfortable = isComfortable;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getMopedNumber() {
        return mopedNumber;
    }

    public void setMopedNumber(int mopedNumber) {
        this.mopedNumber = mopedNumber;
    }

    public byte getMopedId() {
        return mopedId;
    }

    public void setMopedId(byte mopedId) {
        this.mopedId = mopedId;
    }

    public short getMopedCode() {
        return mopedCode;
    }

    public void setMopedCode(short mopedCode) {
        this.mopedCode = mopedCode;
    }

    public long getMopedSerialNumber() {
        return mopedSerialNumber;
    }

    public void setMopedSerialNumber(long mopedSerialNumber) {
        this.mopedSerialNumber = mopedSerialNumber;
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

    public char getMopedRating() {
        return mopedRating;
    }

    public void setMopedRating(char mopedRating) {
        this.mopedRating = mopedRating;
    }

    public boolean isComfortable() {
        return isComfortable;
    }

    public void setComfortable(boolean comfortable) {
        isComfortable = comfortable;
    }

    @Override
    public String toString() {
        return "MopedDto{" +
                "brandName='" + brandName + '\'' +
                ", mopedNumber=" + mopedNumber +
                ", mopedId=" + mopedId +
                ", mopedCode=" + mopedCode +
                ", mopedSerialNumber=" + mopedSerialNumber +
                ", tax=" + tax +
                ", discount=" + discount +
                ", mopedRating=" + mopedRating +
                ", isComfortable=" + isComfortable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MopedDto mopedDto = (MopedDto) o;
        return mopedNumber == mopedDto.mopedNumber && mopedId == mopedDto.mopedId && mopedCode == mopedDto.mopedCode && mopedSerialNumber == mopedDto.mopedSerialNumber && Double.compare(tax, mopedDto.tax) == 0 && Float.compare(discount, mopedDto.discount) == 0 && mopedRating == mopedDto.mopedRating && isComfortable == mopedDto.isComfortable && Objects.equals(brandName, mopedDto.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, mopedNumber, mopedId, mopedCode, mopedSerialNumber, tax, discount, mopedRating, isComfortable);
    }
}
