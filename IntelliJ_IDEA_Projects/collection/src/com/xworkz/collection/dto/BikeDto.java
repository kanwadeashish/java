package com.xworkz.collection.dto;

import java.util.Objects;

public class BikeDto {

    private String brandName;
    private int bikeNumber;
    private byte bikeId;
    private short bikeCode;
    private long bikeSerialNumber;
    private double tax;
    private float discount;
    private char bikeRating;
    private boolean isElectric;

    public BikeDto(String brandName, int bikeNumber, byte bikeId, short bikeCode, long bikeSerialNumber, double tax, float discount, char bikeRating, boolean isElectric) {
        this.brandName = brandName;
        this.bikeNumber = bikeNumber;
        this.bikeId = bikeId;
        this.bikeCode = bikeCode;
        this.bikeSerialNumber = bikeSerialNumber;
        this.tax = tax;
        this.discount = discount;
        this.bikeRating = bikeRating;
        this.isElectric = isElectric;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getBikeNumber() {
        return bikeNumber;
    }

    public void setBikeNumber(int bikeNumber) {
        this.bikeNumber = bikeNumber;
    }

    public byte getBikeId() {
        return bikeId;
    }

    public void setBikeId(byte bikeId) {
        this.bikeId = bikeId;
    }

    public short getBikeCode() {
        return bikeCode;
    }

    public void setBikeCode(short bikeCode) {
        this.bikeCode = bikeCode;
    }

    public long getBikeSerialNumber() {
        return bikeSerialNumber;
    }

    public void setBikeSerialNumber(long bikeSerialNumber) {
        this.bikeSerialNumber = bikeSerialNumber;
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

    public char getBikeRating() {
        return bikeRating;
    }

    public void setBikeRating(char bikeRating) {
        this.bikeRating = bikeRating;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "BikeDto{" +
                "brandName='" + brandName + '\'' +
                ", bikeNumber=" + bikeNumber +
                ", bikeId=" + bikeId +
                ", bikeCode=" + bikeCode +
                ", bikeSerialNumber=" + bikeSerialNumber +
                ", tax=" + tax +
                ", discount=" + discount +
                ", bikeRating=" + bikeRating +
                ", isElectric=" + isElectric +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BikeDto bikeDto = (BikeDto) o;
        return bikeNumber == bikeDto.bikeNumber && bikeId == bikeDto.bikeId && bikeCode == bikeDto.bikeCode && bikeSerialNumber == bikeDto.bikeSerialNumber && Double.compare(tax, bikeDto.tax) == 0 && Float.compare(discount, bikeDto.discount) == 0 && bikeRating == bikeDto.bikeRating && isElectric == bikeDto.isElectric && Objects.equals(brandName, bikeDto.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, bikeNumber, bikeId, bikeCode, bikeSerialNumber, tax, discount, bikeRating, isElectric);
    }
}
