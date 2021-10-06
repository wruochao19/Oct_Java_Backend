import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("a"), new Student("b"), new Student("c")};

        for(int i = 0; i < students.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("请输入学生%d的成绩:", i + 1);
            int grade = sc.nextInt();
            students[i].setGrade(grade);
        }

        Arrays.sort(students, (Student a, Student b) -> b.getGrade() - a.getGrade());
        for(Student student : students) {
            System.out.println("Student{ name = '" + student.getName() + "', grade = " + student.getGrade() + "}");
        }

    }
}
