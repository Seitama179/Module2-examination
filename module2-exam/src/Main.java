import Service.StudentService;
import controller.Controller;
import repository.StudentRepository;
import view.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        StudentView studentView = new StudentView();
        StudentService studentService = new StudentService(studentRepository);
        Controller controller =new Controller(studentView, studentService);
        controller.start();
    }
}