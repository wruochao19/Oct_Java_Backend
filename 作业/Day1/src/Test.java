import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("a"), new Student("b"), new Student("c")};
        for(int i = 0; i < 3; i++){
            Scanner sc = new Scanner(System.in);
            System.out.printf("请输入学生%d的成绩:",i+1);
            Integer input = sc.nextInt();
            students[i].setGrade(input);
        }
        Arrays.sort(students,(a,b)->b.getGrade()-a.getGrade());
        for(Student student: students){
            System.out.println(student);
        }
    }
}
