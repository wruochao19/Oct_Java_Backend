package hw2;

import java.util.*;

/**
 * @author Carter Du
 * DAO layer (local database)
 */
public class StudentRepo {

//    public final HashMap<Integer, Student> dataBase = new HashMap<Integer, Student>(){
//        {
//            dataBase.put(1,new Student("Rick Sanchez", 100));
//            dataBase.put(2,new Student("Summer Smith", 60));
//            dataBase.put(3,new Student("Morty Smith",60));
//        }
//    };
    private final Map<Integer, Student> dataBase = new HashMap<>();

    public StudentRepo(){
        dataBase.put(1,new Student("Rick Sanchez", 100));
        dataBase.put(2,new Student("Summer Smith", 60));
        dataBase.put(3,new Student("Morty Smith",60));
    }

    /**
     * retrieving all students from database
     * @return
     */
    public List<Student> getAllStudents(){
        List<Student> sortedList = new ArrayList<>(dataBase.values());
        //返回所有对象，并按成绩从高到低排序 // （可选）输出成绩从高到低排序，若成绩一样则按名字顺序排序
        sortedList.sort(Comparator.comparing(Student::getGrade).reversed().thenComparing(Student::getName));
       return sortedList;
    }

    /**
     * adding new student to the database
     * @param id
     * @param student
     */
    public boolean insertStudentByID(int id, Student student){
        if(dataBase.containsKey(id)) {
            return false;
        }
        else {
            dataBase.put(id, student);
            return true;
        }
    }

    /**
     * retrieved the student with the specific ID
     * @param id
     * @return
     */
    public Student getStudentByID(int id){
        return dataBase.getOrDefault(id, null);
    }

    /**
     * delete the student in the database with his/her ID
     * @param id
     */
    public void deleteStudentByID(int id){
        dataBase.remove(id);
    }

    /**
     * Update the student's info
     * @param id
     * @param student
     */
    public void updateStudentByID(int id, Student student){
        if(dataBase.containsKey(id)){
//            Student existedStudent = dataBase.get(id);
            dataBase.replace(id, student);
        }
        else{
            System.out.println("Database does not have student with ID: " + id);
        }
    }
}
