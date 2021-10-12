package hw2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService implements Service{
    private final StudentRepo studentRepo = new StudentRepo();
    public StudentService(){}

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.getAllStudents();
    }

    @Override
    public void updateStudentByID(Integer id, Student student) {
        studentRepo.updateStudentByID(id, student);
    }

    @Override
    public void createStudent(Integer id, Student student) {
      if(studentRepo.insertStudentByID(id, student))
          System.out.println("Successful add!");
      else
          System.out.println("The student already exists in the db ...");
    }

    @Override
    public void deleteStudentByID(Integer id) {
        studentRepo.deleteStudentByID(id);
    }

    @Override
    public Student getStudentByID(Integer id) {
        return studentRepo.getStudentByID(id);
    }

}
