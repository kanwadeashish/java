package com.xworkz.encap.dto;

public class AjayDto {

    private int id ;
    private  String name ;
    private long phoneNumber ;
    private double percentage ;
    private char performanceRating ;
    private boolean isPassed ;

    public AjayDto(int id, String name, long phoneNumber, double percentage, char performanceRating, boolean isPassed) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.percentage = percentage;
        this.performanceRating = performanceRating;
        this.isPassed = isPassed;
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

    public char getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(char performanceRating) {
        this.performanceRating = performanceRating;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    @Override
    public String toString() {
        return "AjayDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", percentage=" + percentage +
                ", performanceRating=" + performanceRating +
                ", isPassed=" + isPassed +
                '}';
    }
}
