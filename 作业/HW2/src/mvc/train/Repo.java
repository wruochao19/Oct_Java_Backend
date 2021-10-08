package mvc.train;

import java.util.ArrayList;

public class Repo implements Service{

    private ArrayList<Student> students = new ArrayList<>();

    public Student getStudentById(int id)
    {
        if(getStudentsList() == null)
            return null;
        return checkContainId(id);
    }

    public boolean insertStudent(int id,String name)
    {
        if(checkContainId(id) != null)
            return false;
        else
        {
            addStudentToList(id,name);
            return true;
        }
    }

    public boolean updateStudent(int id,String name)
    {
        if(checkContainId(id) == null)
            return false;
        else
        {
            checkContainId(id).setName(name);
            return true;
        }

    }

    public boolean deleteStudentById(int id)
    {
        if(checkContainId(id) == null)
            return false;
        else
        {
            getStudentsList().remove(checkContainId(id));
            return true;
        }
    }

    public ArrayList<Student> getStudentsList()
    {
        return this.students;
    }

    private Student checkContainId(int id)
    {
        for(Student st:getStudentsList())
        {
            if(st.getId() == id)
                return st;
        }
        return null;
    }

    private void addStudentToList(int id,String name)
    {
        Student student = new Student(id,name);
        this.students.add(student);
    }
}
