package com.xworkz.collection.dto;

import java.util.Objects;

public class RickshawDto {

    private String rickshawName;
    private int rickshawNumber;
    private byte rickshawId;
    private short rickshawCode;
    private long rickshawSerialNumber;
    private double tax;
    private float discount;
    private char rickshawRating;
    private boolean isComfortable;

    public RickshawDto(String rickshawName, int rickshawNumber, byte rickshawId, short rickshawCode, long rickshawSerialNumber, double tax, float discount, char rickshawRating, boolean isComfortable) {
        this.rickshawName = rickshawName;
        this.rickshawNumber = rickshawNumber;
        this.rickshawId = rickshawId;
        this.rickshawCode = rickshawCode;
        this.rickshawSerialNumber = rickshawSerialNumber;
        this.tax = tax;
        this.discount = discount;
        this.rickshawRating = rickshawRating;
        this.isComfortable = isComfortable;
    }

    public String getRickshawName() {
        return rickshawName;
    }

    public void setRickshawName(String rickshawName) {
        this.rickshawName = rickshawName;
    }

    public int getRickshawNumber() {
        return rickshawNumber;
    }

    public void setRickshawNumber(int rickshawNumber) {
        this.rickshawNumber = rickshawNumber;
    }

    public byte getRickshawId() {
        return rickshawId;
    }

    public void setRickshawId(byte rickshawId) {
        this.rickshawId = rickshawId;
    }

    public short getRickshawCode() {
        return rickshawCode;
    }

    public void setRickshawCode(short rickshawCode) {
        this.rickshawCode = rickshawCode;
    }

    public long getRickshawSerialNumber() {
        return rickshawSerialNumber;
    }

    public void setRickshawSerialNumber(long rickshawSerialNumber) {
        this.rickshawSerialNumber = rickshawSerialNumber;
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

    public char getRickshawRating() {
        return rickshawRating;
    }

    public void setRickshawRating(char rickshawRating) {
        this.rickshawRating = rickshawRating;
    }

    public boolean isComfortable() {
        return isComfortable;
    }

    public void setComfortable(boolean comfortable) {
        isComfortable = comfortable;
    }

    @Override
    public String toString() {
        return "RickshawDto{" +
                "rickshawName='" + rickshawName + '\'' +
                ", rickshawNumber=" + rickshawNumber +
                ", rickshawId=" + rickshawId +
                ", rickshawCode=" + rickshawCode +
                ", rickshawSerialNumber=" + rickshawSerialNumber +
                ", tax=" + tax +
                ", discount=" + discount +
                ", rickshawRating=" + rickshawRating +
                ", isComfortable=" + isComfortable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RickshawDto that = (RickshawDto) o;
        return rickshawNumber == that.rickshawNumber && rickshawId == that.rickshawId && rickshawCode == that.rickshawCode && rickshawSerialNumber == that.rickshawSerialNumber && Double.compare(tax, that.tax) == 0 && Float.compare(discount, that.discount) == 0 && rickshawRating == that.rickshawRating && isComfortable == that.isComfortable && Objects.equals(rickshawName, that.rickshawName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rickshawName, rickshawNumber, rickshawId, rickshawCode, rickshawSerialNumber, tax, discount, rickshawRating, isComfortable);
    }
}
