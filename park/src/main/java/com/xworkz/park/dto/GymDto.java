package com.xworkz.park.dto;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class GymDto {
    @NotNull(message = "name field cannot be empty")
    @Size(min=3, max = 30, message = "name should be minimum 3 maximum 30")
    private String name;
    @NotEmpty(message = "currentWeight field cannot be empty")
    private String currentWeight;
    @NotEmpty(message = "desiredWeight field cannot be empty")
    private String desiredWeight;
    @Size(min=10, max = 10, message = "number should maximum 10")
    private String phone;
    @NotEmpty(message = "trainer field cannot be empty")
    private String trainer;

    public GymDto() {
        System.out.println("no arg constructor in GymDto");
    }

    @Override
    public String toString() {
        return "GymDto{" +
                "name='" + name + '\'' +
                ", currentWeight='" + currentWeight + '\'' +
                ", desiredWeight='" + desiredWeight + '\'' +
                ", phone='" + phone + '\'' +
                ", trainer='" + trainer + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(String currentWeight) {
        this.currentWeight = currentWeight;
    }

    public String getDesiredWeight() {
        return desiredWeight;
    }

    public void setDesiredWeight(String desiredWeight) {
        this.desiredWeight = desiredWeight;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
}
