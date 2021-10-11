package Day2.project.service;

import Day2.project.Dao;
import Day2.project.entity.Student;
import java.util.List;

public class ServiceImpl implements Service{

    private static final Dao dao = new Dao();
    // 返回所有对象，并按成绩从高到低排序 // （可选）输出成绩从高到低排序，若成绩一样则按名字顺序排序

    public List<Student> getAllElements() {
        return dao.getAllElements();
    }

    // 通过id更新数据库中的Student
    public void updateElementByKey(Integer id, Student student){
        dao.updateElementByKey(id,student);
    }

    // 通过id创建新Student
    public void createElement(Integer id, Student student) {
        dao.createElement(id,student);
    }

    // 通过id删除对应的Student
    public void deleteElementByKey(Integer id) {
        dao.deleteElementByKey(id);
    }

    // 通过id获取相应的Student
    public Student getElementByKey(Integer id) {
        return dao.getElementByKey(id);
    }
}
