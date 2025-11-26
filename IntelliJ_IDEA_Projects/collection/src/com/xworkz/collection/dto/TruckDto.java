package com.xworkz.collection.dto;

import java.util.Objects;

public class TruckDto {

    private String truckName;
    private int truckNumber;
    private byte truckId;
    private short truckCode;
    private long truckSerialNumber;
    private double tax;
    private float discount;
    private char truckRating;
    private boolean isComfortable;

    public TruckDto(String truckName, int truckNumber, byte truckId, short truckCode, long truckSerialNumber, double tax, float discount, char truckRating, boolean isComfortable) {
        this.truckName = truckName;
        this.truckNumber = truckNumber;
        this.truckId = truckId;
        this.truckCode = truckCode;
        this.truckSerialNumber = truckSerialNumber;
        this.tax = tax;
        this.discount = discount;
        this.truckRating = truckRating;
        this.isComfortable = isComfortable;
    }

    public String getTruckName() {
        return truckName;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    public int getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(int truckNumber) {
        this.truckNumber = truckNumber;
    }

    public byte getTruckId() {
        return truckId;
    }

    public void setTruckId(byte truckId) {
        this.truckId = truckId;
    }

    public short getTruckCode() {
        return truckCode;
    }

    public void setTruckCode(short truckCode) {
        this.truckCode = truckCode;
    }

    public long getTruckSerialNumber() {
        return truckSerialNumber;
    }

    public void setTruckSerialNumber(long truckSerialNumber) {
        this.truckSerialNumber = truckSerialNumber;
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

    public char getTruckRating() {
        return truckRating;
    }

    public void setTruckRating(char truckRating) {
        this.truckRating = truckRating;
    }

    public boolean isComfortable() {
        return isComfortable;
    }

    public void setComfortable(boolean comfortable) {
        isComfortable = comfortable;
    }

    @Override
    public String toString() {
        return "TruckDto{" +
                "truckName='" + truckName + '\'' +
                ", truckNumber=" + truckNumber +
                ", truckId=" + truckId +
                ", truckCode=" + truckCode +
                ", truckSerialNumber=" + truckSerialNumber +
                ", tax=" + tax +
                ", discount=" + discount +
                ", truckRating=" + truckRating +
                ", isComfortable=" + isComfortable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TruckDto truckDto = (TruckDto) o;
        return truckNumber == truckDto.truckNumber && truckId == truckDto.truckId && truckCode == truckDto.truckCode && truckSerialNumber == truckDto.truckSerialNumber && Double.compare(tax, truckDto.tax) == 0 && Float.compare(discount, truckDto.discount) == 0 && truckRating == truckDto.truckRating && isComfortable == truckDto.isComfortable && Objects.equals(truckName, truckDto.truckName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(truckName, truckNumber, truckId, truckCode, truckSerialNumber, tax, discount, truckRating, isComfortable);
    }
}
