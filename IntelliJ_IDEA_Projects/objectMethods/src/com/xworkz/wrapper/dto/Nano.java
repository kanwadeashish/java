package com.xworkz.wrapper.dto;

public class Nano {

    private String carName;
    private int carPrice;
    private byte carNumber;
    private short numberPlate;
    private long serialNumber;
    private double engineLitres;
    private float tax;
    private boolean isCarHybrid;
    private char carRating;

    public Nano(String carName, int carPrice, byte carNumber, short numberPlate, long serialNumber, double engineLitres, float tax, boolean isCarHybrid, char carRating) {
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
    public String toString(){
        return "Nano[carName ="+carName+" carPrice ="+carPrice+" carNumber ="+carNumber+" numberPlate ="+numberPlate+" serialNumber ="+serialNumber+" enginelitres ="+engineLitres+" tax ="+tax+" isCarHybrid ="+isCarHybrid+" carRating ="+carRating+"]";
    }

    @Override
    public int hashCode() {
        int primeNumber = 31;
        int result = 1;
        result = primeNumber * result + (carName != null ? carName.hashCode() : 0);
        result = primeNumber * result + carPrice;
        result = primeNumber * result + carNumber;
        result = primeNumber * result + numberPlate;
        result = primeNumber * result + (int) (serialNumber ^ (serialNumber >>> 32));
        long temp = Double.doubleToLongBits(engineLitres);
        result = primeNumber * result + (int) (temp ^ (temp >>> 32));
        result = primeNumber * result + Float.floatToIntBits(tax);
        result = primeNumber * result + (isCarHybrid ? 1 : 0);
        result = primeNumber * result + carRating;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Nano nano = (Nano) obj;

        if (carPrice != nano.carPrice) return false;
        if (carNumber != nano.carNumber) return false;
        if (numberPlate != nano.numberPlate) return false;
        if (serialNumber != nano.serialNumber) return false;
        if (Double.compare(nano.engineLitres, engineLitres) != 0) return false;
        if (Float.compare(nano.tax, tax) != 0) return false;
        if (isCarHybrid != nano.isCarHybrid) return false;
        if (carRating != nano.carRating) return false;
        return carName != null ? carName.equals(nano.carName) : nano.carName == null;
    }

}
