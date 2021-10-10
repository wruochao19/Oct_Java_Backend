package mvc.train;

import java.util.ArrayList;
import java.util.HashMap;

public class Repo implements Service{

    private final HashMap<Integer,Student> students = new HashMap<>();

    public Student getStudentById(int id)
    {
        if(getStudentsList() == null)
            return null;
        return checkContainId(id);
    }

    public HashMap<Integer,Student> getAllStudents()
    {
        return this.students;
    }

    public boolean insertStudent(int id,String name, int grade)
    {
        if(checkContainId(id) != null)
            return false;
        else
        {
            addStudentToList(id,name,grade);
            return true;
        }
    }

    public boolean updateStudent(int id,String name,int grade)
    {
        if(checkContainId(id) == null)
            return false;
        else
        {
            Student temp = checkContainId(id);
            assert temp != null;
            temp.setName(name);
            temp.setGrade(grade);
            return true;
        }

    }

    public boolean deleteStudentById(int id)
    {
        if(checkContainId(id) == null)
            return false;
        else
        {
            getStudentsList().remove(id);
            return true;
        }
    }

    public HashMap<Integer,Student> getStudentsList()
    {
        return this.students;
    }

    private Student checkContainId(int id)
    {
        for(int key:getStudentsList().keySet())
        {
            if(key == id)
                return getStudentsList().get(key);
        }
        return null;
    }

    private void addStudentToList(int id,String name,int grade)
    {
        Student student = new Student(id,name,grade);
        this.students.put(id,student);
    }
}
