package com.xworkz.collection.dto;

import java.util.Objects;

public class PlaneDto {

    private String planeName;
    private int planeNumber;
    private byte planeId;
    private short planeCode;
    private long planeSerialNumber;
    private double tax;
    private float discount;
    private char planeRating;
    private boolean isComfortable;

    public PlaneDto(String planeName, int planeNumber, byte planeId, short planeCode, long planeSerialNumber, double tax, float discount, char planeRating, boolean isComfortable) {
        this.planeName = planeName;
        this.planeNumber = planeNumber;
        this.planeId = planeId;
        this.planeCode = planeCode;
        this.planeSerialNumber = planeSerialNumber;
        this.tax = tax;
        this.discount = discount;
        this.planeRating = planeRating;
        this.isComfortable = isComfortable;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public int getPlaneNumber() {
        return planeNumber;
    }

    public void setPlaneNumber(int planeNumber) {
        this.planeNumber = planeNumber;
    }

    public byte getPlaneId() {
        return planeId;
    }

    public void setPlaneId(byte planeId) {
        this.planeId = planeId;
    }

    public short getPlaneCode() {
        return planeCode;
    }

    public void setPlaneCode(short planeCode) {
        this.planeCode = planeCode;
    }

    public long getPlaneSerialNumber() {
        return planeSerialNumber;
    }

    public void setPlaneSerialNumber(long planeSerialNumber) {
        this.planeSerialNumber = planeSerialNumber;
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

    public char getPlaneRating() {
        return planeRating;
    }

    public void setPlaneRating(char planeRating) {
        this.planeRating = planeRating;
    }

    public boolean isComfortable() {
        return isComfortable;
    }

    public void setComfortable(boolean comfortable) {
        isComfortable = comfortable;
    }

    @Override
    public String toString() {
        return "PlaneDto{" +
                "planeName='" + planeName + '\'' +
                ", planeNumber=" + planeNumber +
                ", planeId=" + planeId +
                ", planeCode=" + planeCode +
                ", planeSerialNumber=" + planeSerialNumber +
                ", tax=" + tax +
                ", discount=" + discount +
                ", planeRating=" + planeRating +
                ", isComfortable=" + isComfortable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaneDto planeDto = (PlaneDto) o;
        return planeNumber == planeDto.planeNumber && planeId == planeDto.planeId && planeCode == planeDto.planeCode && planeSerialNumber == planeDto.planeSerialNumber && Double.compare(tax, planeDto.tax) == 0 && Float.compare(discount, planeDto.discount) == 0 && planeRating == planeDto.planeRating && isComfortable == planeDto.isComfortable && Objects.equals(planeName, planeDto.planeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeName, planeNumber, planeId, planeCode, planeSerialNumber, tax, discount, planeRating, isComfortable);
    }
}
