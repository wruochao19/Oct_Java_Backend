package Day2.project.service;

import Day2.project.entity.Student;
import java.util.List;
import Day2.project.main.Dao;

public class ServiceImpl implements Service{
    private static final Dao dao = new Dao();

    @Override
    public List<Student> getAllElements() {
        return dao.getAllElements();
    }

    @Override
    public void updateElementByKey(Integer id, Student student) {
        dao.updateElementByKey(id,student);

    }

    @Override
    public void createElement(Integer id, Student student) {
        dao.createElement(id,student);

    }

    @Override
    public void deleteElementByKey(Integer id) {
        dao.deleteElementByKey(id);

    }

    @Override
    public Student getElementByKey(Integer id) {
        return dao.getElementByKey(id);
    }
}
