import java.util.Scanner;

public class Student {
    private String name;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public Student(String n){name = n;}

    public static void main(String[] args){
        Student[] students = new Student[]{new Student("a"),new Student("b"),new Student("c")};
        //输入成绩
        for (int i=0; i<students.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.printf("请输入学生%d的成绩：",i+1);
            students[i].setGrade(sc.nextInt());
        }
        //排序
//        for (Student student: students){
//            student.getGrade()
//        }
//        int index;
        for (int i =0; i<students.length-1;i++){

            for (int j=0; j<students.length-1-i;j++)
                if (students[j].getGrade()<students[j+1].getGrade()){
                    Student o =students[j];
                    students[j]=students[j+1];
                    students[j+1]= o;

            }
        }
        for (Student student: students){
            System.out.println(student);
        }
    }
}
