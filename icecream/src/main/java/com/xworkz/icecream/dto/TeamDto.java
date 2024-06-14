package com.xworkz.icecream.dto;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TeamDto {
    @NotNull(message = "teamName cannot be empty")
    @Size(min=3, max = 30, message = "teamName should be minimum 3 maximum 30")
    private String teamName;

    @NotNull(message = "coachName cannot be empty")
    @Size(min=3, max = 30, message = "coachName should be minimum 3 maximum 30")
    private String coachName;

    @NotNull(message = "email cannot be empty")
    @Size(min=3, max = 30, message = "email should be minimum 3 maximum 30")
    private String email;

    @NotNull(message = "password cannot be empty")
    @Size(min=3, max = 30, message = "password should be minimum 3 maximum 30")
    private String password;

    @NotNull(message = "player1 cannot be null")
    @Size(min=3, max = 30, message = "player1 should be minimum 3 maximum 30")
    private String player1;

    @NotNull(message = "player2 cannot be empty")
    @Size(min=3, max = 30, message = "player2 should be minimum 3 maximum 30")
    private String player2;

    @NotNull(message = "city cannot be empty")
    @Size(min=3, max = 30, message = "city should be minimum 3 maximum 30")
    private String city;

    @NotNull(message = "state cannot be empty")
    private String state;

    @NotNull(message = "gender cannot be empty")
    private String gender;

    @NotNull(message = "checkbox cannot be empty")
    private String checkbox;

    public TeamDto(){
        System.out.println("calling TeamDto");
    }

    @Override
    public String toString() {
        return "TeamDto{" +
                "teamName='" + teamName + '\'' +
                ", coachName='" + coachName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", player1='" + player1 + '\'' +
                ", player2='" + player2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", gender='" + gender + '\'' +
                ", checkbox='" + checkbox + '\'' +
                '}';
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(String checkbox) {
        this.checkbox = checkbox;
    }
}
