package Day1;

import java.util.HashMap;
import java.util.Map;

public class Repo {
    private static Map<Integer,Student> map=new HashMap<>();
    public void insert (Student student) {
        if (map==null) map=new HashMap<>();
        map.put(student.getId(), student);
    }

    public Student getStudentById(Integer id){
        if (map.containsKey(id)) {
             return map.get(id);
        } else return null;
    }

    public void updateStudentById(){

    }

    public void deleteStudentById(){

    }
}
