package Day1;

public class Service {
    private Repo repo=new Repo();
    public void insert(Student student){
        repo.insert(student);
    }
    public void insert(String id,String name){
    }
    public Student getStudentById(Integer id) {
        return repo.getStudentById(id);
    }
}
