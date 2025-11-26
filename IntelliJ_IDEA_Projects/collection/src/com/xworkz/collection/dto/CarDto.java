package com.xworkz.collection.dto;

import java.util.Objects;

public class CarDto {

    private String brandName;
    private int carNumber;
    private byte carId;
    private short carCode;
    private long carSerialNumber;
    private double tax;
    private float discount;
    private char carRating;
    private boolean isElectric;

    public CarDto(String brandName, int carNumber, byte carId, short carCode, long carSerialNumber, double tax, float discount, char carRating, boolean isElectric) {
        this.brandName = brandName;
        this.carNumber = carNumber;
        this.carId = carId;
        this.carCode = carCode;
        this.carSerialNumber = carSerialNumber;
        this.tax = tax;
        this.discount = discount;
        this.carRating = carRating;
        this.isElectric = isElectric;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public byte getCarId() {
        return carId;
    }

    public void setCarId(byte carId) {
        this.carId = carId;
    }

    public short getCarCode() {
        return carCode;
    }

    public void setCarCode(short carCode) {
        this.carCode = carCode;
    }

    public long getCarSerialNumber() {
        return carSerialNumber;
    }

    public void setCarSerialNumber(long carSerialNumber) {
        this.carSerialNumber = carSerialNumber;
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

    public char getCarRating() {
        return carRating;
    }

    public void setCarRating(char carRating) {
        this.carRating = carRating;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "brandName='" + brandName + '\'' +
                ", carNumber=" + carNumber +
                ", carId=" + carId +
                ", carCode=" + carCode +
                ", carSerialNumber=" + carSerialNumber +
                ", tax=" + tax +
                ", discount=" + discount +
                ", carRating=" + carRating +
                ", isElectric=" + isElectric +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDto carDto = (CarDto) o;
        return carNumber == carDto.carNumber && carId == carDto.carId && carCode == carDto.carCode && carSerialNumber == carDto.carSerialNumber && Double.compare(tax, carDto.tax) == 0 && Float.compare(discount, carDto.discount) == 0 && carRating == carDto.carRating && isElectric == carDto.isElectric && Objects.equals(brandName, carDto.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, carNumber, carId, carCode, carSerialNumber, tax, discount, carRating, isElectric);
    }
}
