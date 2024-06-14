package com.xworkz.icecream.dto;

import org.springframework.stereotype.Component;

@Component
public class MatrimonyDTO {
    private String name;
    private int age;
    private String gender;
    private String maritalStatus;
    private String religion;
    private String job;
    private String qualification;
    private String lookingFor;

    @Override
    public String toString() {
        return "MatrimonyDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", marital_status='" + maritalStatus + '\'' +
                ", religion='" + religion + '\'' +
                ", job='" + job + '\'' +
                ", qualification='" + qualification + '\'' +
                ", lookingFor='" + lookingFor + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getLookingFor() {
        return lookingFor;
    }

    public void setLookingFor(String lookingFor) {
        this.lookingFor = lookingFor;
    }
}
