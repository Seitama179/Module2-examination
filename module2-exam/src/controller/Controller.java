package controller;

import Service.StudentService;
import view.StudentView;

public class Controller {
    private StudentView studentView;
    private StudentService studentService;
    public Controller(StudentView studentView, StudentService studentService) {
        this.studentView = studentView;
        this.studentService = studentService;
    }
    int choice;
    public void start(){
        while (true) {
            choice = studentView.displayMenu();
            switch (choice) {
                case 1:
                    studentService.addNewStudent(studentView.addNewStudent());
                    break;
                case 2:
                    int studentID = studentView.getStudentId();
                    studentService.removeStudent(studentID);
                    break;
                case 3:
                    studentService.viewAllStudents();
                    break;
                case 4:

                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
