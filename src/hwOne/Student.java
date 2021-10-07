package hwOne;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private int grade;

    public Student(){}
    public Student(String name){
        this.name = name;
    }
    public Student(String name, int grade) {
        this.name=name;
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }


    @Override
    public int compare(Student o1, Student o2) {
       return o2.getGrade() - o1.getGrade();
    }
}
