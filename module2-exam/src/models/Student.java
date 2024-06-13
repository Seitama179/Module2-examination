package models;


public class Student extends Person{
    private String classroom;


    public Student(int id, String name, String dob, String gender, String phoneNumber, String classroom) {
        super(id, name, dob, gender, phoneNumber);
        this.classroom = classroom;
    }

    public String getClassID() {
        return classroom;
    }

    public void setClassID(String classroom) {
        this.classroom = classroom;
    }
    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getDob() + "," + getGender() + "," + getPhoneNumber() + "," + getClassID();
    }
}
