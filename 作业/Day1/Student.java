import java.util.Scanner;

/**
 * @description: ...
 * @author: nixekgnaww
 */
public class Student {
    private String name;
    private Integer grade;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', grade=%d}",this.name,this.grade);
    }

    public static void main(String[] args){
        Student[] students = new Student[]{new Student("a"), new Student("b"), new Student("c")};
        for(int i = 0;i < 3;i++){
            Scanner sc = new Scanner(System.in);
            System.out.printf("请输入学生%d的成绩:",i+1);
            int input = sc.nextInt();
            students[i].setGrade(input);
        }

        //冒泡==
        Student temp;
        for(int i=0; i<3; i++){
            for(int j=1; j<3-i; j++){
                if(students[j-1].getGrade() < students[j].getGrade()){
                    temp = students[j-1];
                    students[j-1] = students[j];
                    students[j]=temp;
                }
            }
        }


        for(Student student: students){
            System.out.println(student);
        }
    }

}
