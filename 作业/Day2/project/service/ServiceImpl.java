package service;

import entity.Student;
import dao.Dao;


import java.util.Collections;
import java.util.List;
public class ServiceImpl implements Service {
    private Dao dao = new Dao();

    @Override
    public List<Student> getAllElements() {
        List<Student> students = dao.findAll();
        Collections.sort(students, (s1, s2) ->{
            if(s1.getGrade() == s2.getGrade()){
                return s1.getName().compareTo(s2.getName());
            }
            else {
                return s2.getGrade() - s1.getGrade();
            }
        });
        return students;
    }

    @Override
    public void updateElementByKey(Integer id, Student student) {
        dao.updateById(id,student);

    }

    @Override
    public void createElement(Integer id, Student student) {
        dao.createById(id, student);
    }

    @Override
    public void deleteElementByKey(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public Student getElementByKey(Integer id) {
        return dao.findById(id);
    }
}
