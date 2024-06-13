package models;

import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private String dob;
    private String gender;
    private String phoneNumber;
    public Person(int id, String name, String dob, String gender, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
