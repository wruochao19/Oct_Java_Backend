package hw2;

import java.util.List;

/**
 * @author Carter Du
 * 实现Service接口中的抽象方法
 */
public interface Service {
    List<Student> getAllStudent();                         // 返回所有对象，并按成绩从高到低排序 // （可选）输出成绩从高到低排序，若成绩一样则按名字顺序排序
    void updateStudentByID(Integer id, Student student) throws Exception;   // 通过id更新数据库中的Student
    void createStudent(Integer id, Student student);        // 通过id创建新Student
    void deleteStudentByID(Integer id);                    // 通过id删除对应的Student
    Student getStudentByID(Integer id);                    // 通过id获取相应的Student
}
