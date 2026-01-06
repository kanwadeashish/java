package com.xworkz.jdbcDto.dto;

import java.util.Objects;

public class AjayDto {

    private int id ;
    private String name ;
    private short serialNumber ;
    private long phoneNumber ;
    private double percentage ;
    private float passingRate ;
    private boolean isRegular ;
    private char academicRating ;

    public AjayDto(int id, String name, short serialNumber, long phoneNumber, double percentage, float passingRate, boolean isRegular, char academicRating) {
        this.id = id;
        this.name = name;
        this.serialNumber = serialNumber;
        this.phoneNumber = phoneNumber;
        this.percentage = percentage;
        this.passingRate = passingRate;
        this.isRegular = isRegular;
        this.academicRating = academicRating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(short serialNumber) {
        this.serialNumber = serialNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public float getPassingRate() {
        return passingRate;
    }

    public void setPassingRate(float passingRate) {
        this.passingRate = passingRate;
    }

    public boolean isRegular() {
        return isRegular;
    }

    public void setRegular(boolean regular) {
        isRegular = regular;
    }

    public char getAcademicRating() {
        return academicRating;
    }

    public void setAcademicRating(char academicRating) {
        this.academicRating = academicRating;
    }

    @Override
    public String toString() {
        return "AjayDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                ", phoneNumber=" + phoneNumber +
                ", percentage=" + percentage +
                ", passingRate=" + passingRate +
                ", isRegular=" + isRegular +
                ", academicRating=" + academicRating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AjayDto ajayDto = (AjayDto) o;
        return id == ajayDto.id && serialNumber == ajayDto.serialNumber && phoneNumber == ajayDto.phoneNumber && Double.compare(percentage, ajayDto.percentage) == 0 && Float.compare(passingRate, ajayDto.passingRate) == 0 && isRegular == ajayDto.isRegular && academicRating == ajayDto.academicRating && Objects.equals(name, ajayDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, serialNumber, phoneNumber, percentage, passingRate, isRegular, academicRating);
    }
}
