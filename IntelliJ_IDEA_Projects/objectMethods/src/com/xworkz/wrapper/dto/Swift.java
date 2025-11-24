package com.xworkz.wrapper.dto;

import java.util.Objects;

public class Swift {

    private String carName;
    private int carPrice;
    private byte carNumber;
    private short numberPlate;
    private long serialNumber;
    private double engineLitres;
    private float tax;
    private boolean isCarHybrid;
    private char carRating;

    public Swift(String carName, int carPrice, byte carNumber, short numberPlate, long serialNumber, double engineLitres, float tax, boolean isCarHybrid, char carRating) {
        this.carName = carName;
        this.carPrice = carPrice;
        this.carNumber = carNumber;
        this.numberPlate = numberPlate;
        this.serialNumber = serialNumber;
        this.engineLitres = engineLitres;
        this.tax = tax;
        this.isCarHybrid = isCarHybrid;
        this.carRating = carRating;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }
    public void setCarNumber(byte carNumber) {
        this.carNumber = carNumber;
    }
    public void setNumberPlate(short numberPlate) {
        this.numberPlate = numberPlate;
    }
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setEngineLitres(double engineLitres) {
        this.engineLitres = engineLitres;
    }
    public void setTax(float tax) {
        this.tax = tax;
    }
    public void setCarHybrid(boolean carHybrid) {
        isCarHybrid = carHybrid;
    }
    public void setCarRating(char carRating) {
        this.carRating = carRating;
    }

    public String getCarName() {
        return carName;
    }
    public int getCarPrice() {
        return carPrice;
    }
    public byte getCarNumber() {
        return carNumber;
    }
    public short getNumberPlate() {
        return numberPlate;
    }
    public long getSerialNumber() {
        return serialNumber;
    }
    public double getEngineLitres() {
        return engineLitres;
    }
    public float getTax() {
        return tax;
    }
    public boolean isCarHybrid() {
        return isCarHybrid;
    }
    public char getCarRating() {
        return carRating;
    }

    @Override
    public String toString() {
        return "Swift{" +
                "carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                ", carNumber=" + carNumber +
                ", numberPlate=" + numberPlate +
                ", serialNumber=" + serialNumber +
                ", engineLitres=" + engineLitres +
                ", tax=" + tax +
                ", isCarHybrid=" + isCarHybrid +
                ", carRating=" + carRating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Swift swift = (Swift) o;
        return carPrice == swift.carPrice && carNumber == swift.carNumber && numberPlate == swift.numberPlate && serialNumber == swift.serialNumber && Double.compare(engineLitres, swift.engineLitres) == 0 && Float.compare(tax, swift.tax) == 0 && isCarHybrid == swift.isCarHybrid && carRating == swift.carRating && Objects.equals(carName, swift.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, carPrice, carNumber, numberPlate, serialNumber, engineLitres, tax, isCarHybrid, carRating);
    }
}
