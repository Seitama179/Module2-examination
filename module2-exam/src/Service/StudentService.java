package Service;
import models.Student;
import repository.StudentRepository;

public class StudentService implements IStudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void addNewStudent(Student student) {
        studentRepository.addNewStudent(student);
    }

    @Override
    public void removeStudent(int studentID) {
        studentRepository.removeStudent(studentID);
    }

    @Override
    public void viewAllStudents() {
        studentRepository.viewAllStudents();
    }
}
