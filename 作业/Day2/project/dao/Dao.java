package project.dao;

import entity.Student;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Dao {
    // 初始化数据库
    // HashMap<id, Student>

    private HashMap<Integer, Student> dataBase = new HashMap<Integer, Student>(){
        {
            dataBase.put(1,new Student("Rick Sanchez", 100));
            dataBase.put(2,new Student("Summer Smith", 60));
            dataBase.put(3,new Student("Morty Smith",60));
        }
    };

    // 实现对数据的CURD操作

    // 返回所有对象
    public List<Student> getAllElements(){
        List res = (List)dataBase.values();
        return res;
    }

    // 返回所有对象，并按成绩从高到低排序 // （可选）输出成绩从高到低排序，若成绩一样则按名字顺序排序
    public List<Student> getAllElementsSorted(){
        List res = getAllElements();
        res.sort(Comparator.comparing(Student::getGrade,Comparator.reverseOrder()).thenComparing(Student::getName));
        return res;
    }

    // 通过id更新数据库中的Student
    public void updateElementByKey(Integer id, Student student){
        dataBase.put(id,student);
    }

    // 通过id创建新Student
    public void createElement(Integer id, Student student){
        dataBase.put(id,student);
    }

    // 通过id删除对应的Student
    public void deleteElementByKey(Integer id){
        dataBase.remove(id);
    }

    // 通过id获取相应的Student
    public Student getElementByKey(Integer id){
        return dataBase.get(id);
    }
}
