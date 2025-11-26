package com.xworkz.collection.dto;

import java.util.Objects;

public class CycleDto {

    private String cycleName;
    private int cycleNumber;
    private byte cycleId;
    private short cycleCode;
    private long cycleSerialNumber;
    private double tax;
    private float discount;
    private char cycleRating;
    private boolean isComfortable;

    public CycleDto(String cycleName, int cycleNumber, byte cycleId, short cycleCode, long cycleSerialNumber, double tax, float discount, char cycleRating, boolean isComfortable) {
        this.cycleName = cycleName;
        this.cycleNumber = cycleNumber;
        this.cycleId = cycleId;
        this.cycleCode = cycleCode;
        this.cycleSerialNumber = cycleSerialNumber;
        this.tax = tax;
        this.discount = discount;
        this.cycleRating = cycleRating;
        this.isComfortable = isComfortable;
    }

    public String getCycleName() {
        return cycleName;
    }

    public void setCycleName(String cycleName) {
        this.cycleName = cycleName;
    }

    public int getCycleNumber() {
        return cycleNumber;
    }

    public void setCycleNumber(int cycleNumber) {
        this.cycleNumber = cycleNumber;
    }

    public byte getCycleId() {
        return cycleId;
    }

    public void setCycleId(byte cycleId) {
        this.cycleId = cycleId;
    }

    public short getCycleCode() {
        return cycleCode;
    }

    public void setCycleCode(short cycleCode) {
        this.cycleCode = cycleCode;
    }

    public long getCycleSerialNumber() {
        return cycleSerialNumber;
    }

    public void setCycleSerialNumber(long cycleSerialNumber) {
        this.cycleSerialNumber = cycleSerialNumber;
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

    public char getCycleRating() {
        return cycleRating;
    }

    public void setCycleRating(char cycleRating) {
        this.cycleRating = cycleRating;
    }

    public boolean isComfortable() {
        return isComfortable;
    }

    public void setComfortable(boolean comfortable) {
        isComfortable = comfortable;
    }

    @Override
    public String toString() {
        return "CycleDto{" +
                "cycleName='" + cycleName + '\'' +
                ", cycleNumber=" + cycleNumber +
                ", cycleId=" + cycleId +
                ", cycleCode=" + cycleCode +
                ", cycleSerialNumber=" + cycleSerialNumber +
                ", tax=" + tax +
                ", discount=" + discount +
                ", cycleRating=" + cycleRating +
                ", isComfortable=" + isComfortable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CycleDto cycleDto = (CycleDto) o;
        return cycleNumber == cycleDto.cycleNumber && cycleId == cycleDto.cycleId && cycleCode == cycleDto.cycleCode && cycleSerialNumber == cycleDto.cycleSerialNumber && Double.compare(tax, cycleDto.tax) == 0 && Float.compare(discount, cycleDto.discount) == 0 && cycleRating == cycleDto.cycleRating && isComfortable == cycleDto.isComfortable && Objects.equals(cycleName, cycleDto.cycleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cycleName, cycleNumber, cycleId, cycleCode, cycleSerialNumber, tax, discount, cycleRating, isComfortable);
    }
}
