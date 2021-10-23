package hw2;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Service Layer
 * @author Carter Du
 */
@org.springframework.stereotype.Service
public class StudentService implements Service{
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.getAllStudents();
    }

    @Override
    public void updateStudentByID(Integer id, Student student){
        studentRepo.updateStudentByID(id, student);
    }

    @Override
    public void createStudent(Integer id, Student student) {
        studentRepo.insertStudentByID(id, student);
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
