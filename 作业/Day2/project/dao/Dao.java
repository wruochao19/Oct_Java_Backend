package project.dao;

import project.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Dao {
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

    // 返回所有对象
    public List<Student> getAllElements(){
        List res = new ArrayList(dataBase.values());
        return res;
    }

    // 返回所有对象，并按成绩从高到低排序 // （可选）输出成绩从高到低排序，若成绩一样则按名字顺序排序
    public List<Student> getAllElementsSorted(){
        List res = getAllElements();
        res.sort(Comparator.comparing(Student::getGrade,Comparator.reverseOrder()).thenComparing(Student::getName));
        return res;
    }

    // 通过id更新数据库中的Student
    public int updateElementByKey(Integer id, Student student){
        if (dataBase.containsKey(id)){
            dataBase.put(id,student);
            return 0;
        }
        else{
            return -1;
        }
    }

    // 通过id创建新Student
    public int createElement(Integer id, Student student){
        if (!dataBase.containsKey(id)){
            dataBase.put(id,student);
            return 0;
        }
        else{
            return -1;
        }

    }

    // 通过id删除对应的Student
    public int deleteElementByKey(Integer id){
        if (dataBase.containsKey(id)){
            dataBase.remove(id);
            return 0;
        }
        else{
            return -1;
        }
    }

    // 通过id获取相应的Student
    public Student getElementByKey(Integer id){
        return dataBase.get(id);
    }
}
