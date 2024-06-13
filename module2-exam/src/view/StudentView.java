package view;

import models.Student;
import repository.StudentRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    StudentRepository studentRepository = new StudentRepository();
    List<Student> students = studentRepository.loadStudents();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public int displayMenu() {
        System.out.println("---Student Menu---");
        System.out.println("1. Add new Student");
        System.out.println("2. Remove Student");
        System.out.println("3. View Student List");
        System.out.println("4. Find Student");
        System.out.println("0. Exit");
        return Integer.parseInt(scanner.nextLine());
    }


    public int getStudentId() {
        System.out.print("Enter student ID: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String getStudentName() {
        System.out.print("Enter student name: ");
        return scanner.nextLine();
    }

    public String getStudentDob() {
        System.out.print("Enter student date of birth (dd-MM-yyyy): ");
        return scanner.nextLine();
    }

    public String getStudentGender() {
        System.out.print("Enter student gender: ");
        return scanner.nextLine();
    }

    public String getStudentPhoneNumber() {
        System.out.print("Enter student phone number: ");
        return scanner.nextLine();
    }

    public String getStudentClassroom() {
        System.out.print("Enter student classroom: ");
        return scanner.nextLine();
    }


    public void displayStudent(Student student) {

    }

    public Student addNewStudent() {
        int id = students.size()+1;
        String name = getStudentName();
        String dob = getStudentDob();
        String gender = getStudentGender();
        String phoneNumber = getStudentPhoneNumber();
        String classroom = getStudentClassroom();
        Student student = new Student(id, name, dob, gender, phoneNumber, classroom);
        return student;
    }
}
