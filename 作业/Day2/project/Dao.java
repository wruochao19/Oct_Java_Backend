import entity.Student;

import java.util.HashMap;

public class Dao {
    // 初始化数据库
    // HashMap<id, Student>

    HashMap<Integer, Student> dataBase = new HashMap<Integer, Student>(){
        {
            dataBase.put(1,new Student("Rick Sanchez", 100));
            dataBase.put(2,new Student("Summer Smith", 60));
            dataBase.put(3,new Student("Morty Smith",60));
        }
    };

    // 实现对数据的CURD操作
}
