package com.xworkz.icecream.dto;

import org.springframework.stereotype.Component;

@Component
public class ContactDto {
    private String name;
    private String email;
    private String contact;
    private String comments;

    @Override
    public String toString() {
        return "ContactDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
