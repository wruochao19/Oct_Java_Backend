package mvc.train;

import java.util.ArrayList;
import java.util.HashMap;

public class Controller {
    private final Service service = new ServiceImpl();
    public Student getStudentById(int id)
    {
        return service.getStudentById(id);
    }

    public boolean insertStudent(int id,String name, int grade)
    {
        return service.insertStudent(id,name,grade);
    }

    public HashMap<Integer,Student> getAllStudents()
    {
        return service.getAllStudents();
    }

    public boolean updateStudent(int id,String name,int grade)
    {
        return service.updateStudent(id,name,grade);
    }

    public boolean deleteStudentById(int id)
    {
        return service.deleteStudentById(id);
    }
}
