package repository;
import models.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private static final String FILE_PATH = "StudentData.csv";
    List<Student> students = new ArrayList<>();

    public void addNewStudent(Student student) {
        loadStudents();
        students.add(student);
        saveStudents(students);
    }

    public void removeStudent(int studentID) {
        students.removeIf(student -> student.getId() == studentID);
        saveStudents(students);
    }

    public void viewAllStudents() {
        loadStudents();
        for(Student student : students) {
            System.out.println(student);
        }
    }

    public void saveStudents(List<Student> students) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("ID, Name, Date of Birth, Gender, Phone Number, Classroom\n");
            for (Student student : students) {
                bw.write(student.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving students");;
        }
        System.out.println("Students saved to: " + FILE_PATH);
    }

    public List<Student> loadStudents() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String dob = data[2];
                String gender = data[3];
                String phoneNumber = data[4];
                String classID = data[5];
                students.add(new Student(id, name, dob, gender, phoneNumber, classID));
            }
        } catch (IOException e) {
            System.out.println("Failed to load students");;
        }
        return students;
    }
}
