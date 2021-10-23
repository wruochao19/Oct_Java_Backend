package hw2;

import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @author Carter Du
 * DAO layer (local database)
 */
@Repository
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
    public void insertStudentByID(int id, Student student){
       try{
           if(dataBase.containsKey(id)) {
               throw new Exception("Current Database already has THIS student!" +
                       " Student ID must be UNIQUE!");
           }
           else {
               dataBase.put(id, student);
               System.out.println("Successful add!");
           }
       }
       catch (Exception e){
           System.err.println(e.getMessage());
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
        try{
            if(!dataBase.containsKey(id))
                throw new Exception("Current Database does not have such student with ID: " + id);
            else {
                dataBase.remove(id);
                System.out.println("Student with ID " + id + " removed successful!");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Update the student's info
     * @param id
     * @param student
     */
    public void updateStudentByID(int id, Student student){
        try{
            if(dataBase.containsKey(id)){
                dataBase.replace(id, student);
            }
            else{
                throw new Exception("Database does not have student with ID: " + id);
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
