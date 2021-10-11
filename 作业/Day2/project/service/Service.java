package project.service;

import project.entity.Student;

import java.util.List;


// 实现Service接口中的抽象方法
public interface Service {
    List<Student> getAllElements();                         // 返回所有对象，并按成绩从高到低排序 // （可选）输出成绩从高到低排序，若成绩一样则按名字顺序排序
    void updateElementByKey(Integer id, Student student);   // 通过id更新数据库中的Student
    void createElement(Integer id, Student student);        // 通过id创建新Student
    void deleteElementByKey(Integer id);                    // 通过id删除对应的Student
    Student getElementByKey(Integer id);                    // 通过id获取相应的Student

}
