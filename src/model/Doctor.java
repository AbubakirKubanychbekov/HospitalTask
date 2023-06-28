package model;
import java.util.*;
import enums.Gender;

public class Doctor {
    private Long id;
    private String firstName;
    private String lastName;
    private int experienceYear;
    private Gender gender;

    public Doctor(Long id, String firstName, String lastName, int experienceYear, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceYear=experienceYear;
        this.gender = gender;
    }

    public Doctor() {
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Doctor" +
                "id: " + id +
                ", firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", experienceYear: " + experienceYear +
                ", gender: " + gender;
    }
}
