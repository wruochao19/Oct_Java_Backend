package dao;

import entity.Student;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
    public List<Student> findAll(){
        try {
             List<Student> students =  dataBase.values().stream().collect(Collectors.toList());
             return students;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public Student findById(Integer id){
        if(dataBase.containsKey(id)){
            try {
                return dataBase.get(id);
            }
            catch (Exception e){
                return null;
            }
        }
        else
            return null;
    }

    public void createById(Integer id, Student student){
        if(!dataBase.containsKey(id)){
            try {
                dataBase.put(id, student);
                System.out.println("success");
            }
            catch (Exception e){
                System.out.println(e);

            }
        }
        else{
            System.out.println("failed");
        }
    }

    public void deleteById(Integer id){
        try{
            dataBase.remove(id);
            System.out.println("success");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void updateById(Integer id, Student student){
        if (dataBase.containsKey(id)){
            try {
                dataBase.put(id,student);
                System.out.println("success");
            }
            catch (Exception e){
                System.out.println(e);
                System.out.println("failed");
            }
        }
        else{
            System.out.println("failed");
        }
    }
}
