package com.xworkz.collection.dto;

import java.util.Objects;

public class TrainDto {

    private String trainName;
    private int trainNumber;
    private byte trainId;
    private short trainCode;
    private long trainSerialNumber;
    private double tax;
    private float discount;
    private char trainRating;
    private boolean isElectric;

    public TrainDto(String trainName, int trainNumber, byte trainId, short trainCode, long trainSerialNumber, double tax, float discount, char trainRating, boolean isElectric) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.trainId = trainId;
        this.trainCode = trainCode;
        this.trainSerialNumber = trainSerialNumber;
        this.tax = tax;
        this.discount = discount;
        this.trainRating = trainRating;
        this.isElectric = isElectric;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public byte getTrainId() {
        return trainId;
    }

    public void setTrainId(byte trainId) {
        this.trainId = trainId;
    }

    public short getTrainCode() {
        return trainCode;
    }

    public void setTrainCode(short trainCode) {
        this.trainCode = trainCode;
    }

    public long getTrainSerialNumber() {
        return trainSerialNumber;
    }

    public void setTrainSerialNumber(long trainSerialNumber) {
        this.trainSerialNumber = trainSerialNumber;
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

    public char getTrainRating() {
        return trainRating;
    }

    public void setTrainRating(char trainRating) {
        this.trainRating = trainRating;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "TrainDto{" +
                "trainName='" + trainName + '\'' +
                ", trainNumber=" + trainNumber +
                ", trainId=" + trainId +
                ", trainCode=" + trainCode +
                ", trainSerialNumber=" + trainSerialNumber +
                ", tax=" + tax +
                ", discount=" + discount +
                ", trainRating=" + trainRating +
                ", isElectric=" + isElectric +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainDto trainDto = (TrainDto) o;
        return trainNumber == trainDto.trainNumber && trainId == trainDto.trainId && trainCode == trainDto.trainCode && trainSerialNumber == trainDto.trainSerialNumber && Double.compare(tax, trainDto.tax) == 0 && Float.compare(discount, trainDto.discount) == 0 && trainRating == trainDto.trainRating && isElectric == trainDto.isElectric && Objects.equals(trainName, trainDto.trainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainName, trainNumber, trainId, trainCode, trainSerialNumber, tax, discount, trainRating, isElectric);
    }
}
