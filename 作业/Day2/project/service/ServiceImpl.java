package project.service;

import project.dao.Dao;
import project.entity.Student;

import java.util.List;

/**
 * @description: ...
 * @author: nixekgnaww
 */
public class ServiceImpl implements Service {


    private Dao dao = new Dao();


    // 返回所有对象，并按成绩从高到低排序 // （可选）输出成绩从高到低排序，若成绩一样则按名字顺序排序
    @Override
    public List<Student> getAllElements(){
        return dao.getAllElementsSorted();
    }

    // 通过id更新数据库中的Student
    @Override
    public void updateElementByKey(Integer id, Student student){
        int flag = dao.updateElementByKey(id,student);
        if (flag == 0){
            System.out.println("Update Success!");
        }
        else{
            System.out.println("Update Failed! ID not found. Check id again or use Add to create new record");
        }
    }

    // 通过id创建新Student
    @Override
    public void createElement(Integer id, Student student){
        int flag = dao.createElement(id,student);
        if (flag == 0){
            System.out.println("Create Success!");
        }
        else{
            System.out.println("Create Failed! ID exists, try another id or use Update to edit record");
        }
    }

    // 通过id删除对应的Student
    @Override
    public void deleteElementByKey(Integer id){
        int flag = dao.deleteElementByKey(id);
        if (flag == 0){
            System.out.println("Delete Success!");
        }
        else{
            System.out.println("Delete Failed! ID not found");
        }
    }

    // 通过id获取相应的Student
    @Override
    public Student getElementByKey(Integer id){
        return dao.getElementByKey(id);
    }
}
