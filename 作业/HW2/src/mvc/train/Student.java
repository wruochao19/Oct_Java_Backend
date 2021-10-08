package mvc.train;

import java.util.*;

public class Student{
    private String name;
    private int id;
    private int grade;
//    public static void main(String[] args)
//    {
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("a"));
//        students.add(new Student("b"));
//        students.add(new Student("c"));
//
//        int i = 0;
//        for (Student st :students)
//        {
//            st.inputGrade();
//        }
//        //Sort student with higher grade first.
//        Collections.sort(students, (s1, s2) -> new Integer(s2.getGrade()).compareTo(s1.getGrade()));
//
//        for (Student st :students)
//        {
//            System.out.println(st.toString());
//        }
//    }
    public Student(){}
    public Student(String name)
    {
        this.name = name;
    }

    public Student(int id,String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getGrade()
    {
        return this.grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void inputGrade()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入"+this.getName()+"同学的成绩：");
        this.setGrade(sc.nextInt());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
