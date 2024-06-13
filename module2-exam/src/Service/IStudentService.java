package Service;

import models.Student;

public interface IStudentService {
    public void addNewStudent(Student student);
    public void removeStudent(int studentID);
    public void viewAllStudents();
}
