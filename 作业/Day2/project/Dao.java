import entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
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



//    List<Student> getAllElements();                         // 返回所有对象，并按成绩从高到低排序 // （可选）输出成绩从高到低排序，若成绩一样则按名字顺序排序
    private List<Student> getAllElements(){
        List<Student> res = new ArrayList<Student>(dataBase.values());
        List<Student> result = sortStudent(res);
        return result;
    }
    private List<Student> sortStudent (List<Student> res){
        res.sort(Comparator.comparing(Student::getGrade,Comparator.reverseOrder()).thenComparing(Student::getName));
        return res;
    }
//    void updateElementByKey(Integer id, Student student);   // 通过id更新数据库中的Student
    public void updateElementByKey(Integer id, Student student){
            if (dataBase.containsKey(id)){
                dataBase.put(id,student);
            } else {
                System.out.println("没有这个id");
            }
        }
//    void createElement(Integer id, Student student);        // 通过id创建新Student
    public void createElement(Integer id, Student student){
        if(dataBase.containsKey(id)){
            System.out.println("id已存在");
        } else {
        dataBase.put(id, student);
    }
//    void deleteElementByKey(Integer id);                    // 通过id删除对应的Student
        public void deleteElementByKey (Integer id) {
          if(dataBase.containsKey(id)){
              dataBase.remove(id);
          }  else {
              System.out.println("没有这个id");
          }
        }
    }
//    Student getElementByKey(Integer id);                    // 通过id获取相应的Student
    public Student getElementByKey(Integer id){
        if(dataBase.containsKey(id)){
            return dataBase.get(id);
        } else {
            System.out.println("查无此人");
        }
    }
}
