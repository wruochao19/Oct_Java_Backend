package mvc.train;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Service{
    Student getStudentById(int id);
    ArrayList<Student> getAllStudents();
    boolean insertStudent(int id,String name, int grade);
    boolean updateStudent(int id,String name,int grade);
    boolean deleteStudentById(int id);
}
