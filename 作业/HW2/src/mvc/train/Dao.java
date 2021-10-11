package mvc.train;

import java.util.HashMap;

public class Dao {
    private static final HashMap<Integer,Student> students = new HashMap<>();
    public Dao(){}
    public HashMap<Integer,Student> getStudents()
    {
        return students;
    }
}
