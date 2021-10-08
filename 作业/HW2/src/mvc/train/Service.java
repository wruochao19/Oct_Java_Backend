package mvc.train;

public interface Service{
    Student getStudentById(int id);
    boolean insertStudent(int id,String name);
    boolean updateStudent(int id,String name);
    boolean deleteStudentById(int id);
}
