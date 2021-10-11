package Day2.project;

import Day2.project.entity.Student;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Dao{
    // 初始化数据库
    // HashMap<id, Student>
    private HashMap<Integer, Student> dataBase = new HashMap<Integer, Student>() {{
            put(1, new Student("Rick Sanchez", 100));
            put(2, new Student("Summer Smith", 60));
            put(3, new Student("Morty Smith", 60));
        }};

    // 实现对数据的CURD操作
    // 返回所有对象，并按成绩从高到低排序 // （可选）输出成绩从高到低排序，若成绩一样则按名字顺序排序
    public List<Student> getAllElements() {
        return dataBase.values().stream().toList();
    }

    // 通过id更新数据库中的Student
    public void updateElementByKey(Integer id, Student student){
        if (dataBase.containsKey(id)) {
            dataBase.replace(id, student);
            System.out.println("Update student "+id);
        } else {
            System.out.println("Id does not exist, please pick another id");
        }
    }

    // 通过id创建新Student
    public void createElement(Integer id, Student student) {
        if (dataBase.containsKey(id)) {
            System.out.println("Id exists, please pick another id");
        } else {
            dataBase.put(id, student);
            System.out.println("Add student "+id);
        }
    }

    // 通过id删除对应的Student
    public void deleteElementByKey(Integer id) {
        if (dataBase.containsKey(id)) {
            dataBase.remove(id);
            System.out.println("Remove student "+id);
        } else {
            System.out.println("Id does not exist");
        }
    }

    // 通过id获取相应的Student
    public Student getElementByKey(Integer id) {
        if (dataBase.containsKey(id)) {
            return dataBase.get(id);
        } else {
            System.out.println("Id does not exist");
        }
        return null;
    }
}
