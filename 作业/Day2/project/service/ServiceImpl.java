package Day2.project.service;

import Day2.project.Dao;
import entity.Student;
import java.util.List;

public class ServiceImpl implements service.Service {
    Dao dao=new Dao();
    @Override
    public List<Student> getAllElements() {
        return dao.sortAllElements();
    }

    @Override
    public void updateElementByKey(Integer id, Student student) {
        dao.updateElementById(id,student);
    }

    @Override
    public void createElement(Integer id, Student student) {
        dao.createElementById(id,student);
    }

    @Override
    public void deleteElementByKey(Integer id) {
        dao.deleteElementById(id);
    }

    @Override
    public Student getElementByKey(Integer id) {
        return dao.getElementByID(id);
    }
}
