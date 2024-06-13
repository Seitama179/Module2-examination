package models;

import java.time.LocalDate;

public class Teacher extends Person {
    private String className;

    public Teacher(int id, String name, String dob, String gender, String phoneNumber, String className) {
        super(id, name, dob, gender, phoneNumber);
        this.className = className;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
}
