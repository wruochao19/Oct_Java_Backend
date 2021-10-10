package mvc.train;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public interface Service{
    Student getStudentById(int id);
    HashMap<Integer,Student> getAllStudents();
    boolean insertStudent(int id,String name, int grade);
    boolean updateStudent(int id,String name,int grade);
    boolean deleteStudentById(int id);
}
