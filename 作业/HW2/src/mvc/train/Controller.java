package mvc.train;

public class Controller {
    private final Service service = new Repo();
    public Student getStudentById(int id)
    {
        return service.getStudentById(id);
    }

    public boolean insertStudent(int id,String name)
    {
        return service.insertStudent(id,name);
    }

    public boolean updateStudent(int id,String name)
    {
        return service.updateStudent(id,name);
    }

    public boolean deleteStudentById(int id)
    {
        return service.deleteStudentById(id);
    }
}
