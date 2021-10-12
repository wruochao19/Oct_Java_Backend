package Day2.project.main;

import Day2.project.entity.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dao{
    // 初始化数据库
    // HashMap<id, Student>
    HashMap<Integer, Student> dataBase = new HashMap<Integer, Student>(){
        {
            put(1,new Student("Rick Sanchez", 100));
            put(2,new Student("Summer Smith", 60));
            put(3,new Student("Morty Smith",60));
        }
    };
    // 实现对数据的CURD操作
    public List<Student> getAllElements() {
        ArrayList<Student> li = new ArrayList<>();

        dataBase.entrySet().forEach(entry ->
        {   li.add(entry.getValue());
        });

        return li;
    }
    public void updateElementByKey(Integer id, Student student) {
        if (dataBase.containsKey(id)){
            dataBase.replace(id,student);
            System.out.println("Done, updating successfully");
        }
        else{
            System.out.println("Student not found in the database, please add the student to the database first");
        }
    }
    public void createElement(Integer id, Student student) {
        if(dataBase.containsKey(id)){
            System.out.println("Another Student is currently using this ID, please use another ID number.");
        }else {
            dataBase.put(id, student);
            System.out.println("Done, adding successfully");
        }
    }
    public void deleteElementByKey(Integer id) {
        if (dataBase.containsKey(id)){
            dataBase.remove(id);
            System.out.println("Deleting Successfully!");
        }else{
            System.out.println("Student ID not found in the database.");
        }

    }
    public Student getElementByKey(Integer id) {
        Student student = dataBase.get(id);
        return student;

    }
}

