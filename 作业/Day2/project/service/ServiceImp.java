package service;
import service.Dao;
import java.util.List;

public class ServiceImp implements Service {

    @Override
    public List<Student> getAllElements() {
        return getAllElements();
    }

    @Override
    public void updateElementByKey(Integer id, Student student) {
     Dao.updateElementByKey(id,student);
    }

    @Override
    public void createElement(Integer id, Student student) {
        Dao.createElement(id,student);
    }

    @Override
    public void deleteElementByKey(Integer id) {
            Dao.deleteElementByKey(id);
    }

    @Override
    public Student getElementByKey(Integer id) {
        return getElementByKey;
    }
}
