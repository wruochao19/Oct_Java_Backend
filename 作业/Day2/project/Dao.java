package Day2.project;

import entity.Student;

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

    public List getAllElements(){
        List res=new ArrayList(dataBase.values());
        return res;
    }
    public List<Student> sortAllElements(){
        List res=getAllElements();
        res.sort(Comparator.comparing(Student::getGrade, Comparator.reverseOrder()).thenComparing(Student::getName));
        return res;
    }

    public void updateElementById(Integer id, Student student){
        dataBase.replace(id,student);
    }

    public void createElementById(Integer id, Student student){
        dataBase.put(id,student);
    }
    public void deleteElementById(Integer id){
        dataBase.remove(id);
    }
    public Student getElementByID(Integer id){
        return dataBase.get(id);
    }



    // 实现对数据的CURD操作
}
