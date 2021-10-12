package hw2;

import java.util.List;
import java.util.Scanner;

/**
 * generate users' commands for the behaviors
 */
public class Controller {
    private final StudentService service = new StudentService();
    public Controller(){}

    public void addStudent(int id, Student student){
        service.createStudent(id, student);
    }

    public List<Student> getStudent(){
        return service.getAllStudent();
    }

    public Student getStudentWithID(int id){
        return service.getStudentByID(id);
    }

    public void updateStudentWithID(int id, Student student){
        service.updateStudentByID(id, student);
    }

    public void deleteStudentByID(int id){
        service.deleteStudentByID(id);
    }
}
