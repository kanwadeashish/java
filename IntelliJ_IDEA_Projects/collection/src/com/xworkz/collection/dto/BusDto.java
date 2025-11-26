package com.xworkz.collection.dto;

import java.util.Objects;

public class BusDto {

    private String busName;
    private int busNumber;
    private byte busId;
    private short busCode;
    private long busSerialNumber;
    private double tax;
    private float discount;
    private char busRating;
    private boolean isElectric;

    public BusDto(String busName, int busNumber, byte busId, short busCode, long busSerialNumber, double tax, float discount, char busRating, boolean isElectric) {
        this.busName = busName;
        this.busNumber = busNumber;
        this.busId = busId;
        this.busCode = busCode;
        this.busSerialNumber = busSerialNumber;
        this.tax = tax;
        this.discount = discount;
        this.busRating = busRating;
        this.isElectric = isElectric;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public byte getBusId() {
        return busId;
    }

    public void setBusId(byte busId) {
        this.busId = busId;
    }

    public short getBusCode() {
        return busCode;
    }

    public void setBusCode(short busCode) {
        this.busCode = busCode;
    }

    public long getBusSerialNumber() {
        return busSerialNumber;
    }

    public void setBusSerialNumber(long busSerialNumber) {
        this.busSerialNumber = busSerialNumber;
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

    public char getBusRating() {
        return busRating;
    }

    public void setBusRating(char busRating) {
        this.busRating = busRating;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "BusDto{" +
                "busName='" + busName + '\'' +
                ", busNumber=" + busNumber +
                ", busId=" + busId +
                ", busCode=" + busCode +
                ", busSerialNumber=" + busSerialNumber +
                ", tax=" + tax +
                ", discount=" + discount +
                ", busRating=" + busRating +
                ", isElectric=" + isElectric +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusDto busDto = (BusDto) o;
        return busNumber == busDto.busNumber && busId == busDto.busId && busCode == busDto.busCode && busSerialNumber == busDto.busSerialNumber && Double.compare(tax, busDto.tax) == 0 && Float.compare(discount, busDto.discount) == 0 && busRating == busDto.busRating && isElectric == busDto.isElectric && Objects.equals(busName, busDto.busName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busName, busNumber, busId, busCode, busSerialNumber, tax, discount, busRating, isElectric);
    }
}
