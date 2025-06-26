package com.mvc.model;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class userforform2  {
   

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int experience;
    private String username;
    private String mail;
    private String password;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    // Default constructor
    public userforform2() {
        super();
    }

    // Parameterized constructor
    public userforform2(int id, int experience, LocalDate dateOfBirth, String username, String mail, String password) {
        super();
        this.id = id;
        this.experience = experience;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.mail = mail;
        this.password = password;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
