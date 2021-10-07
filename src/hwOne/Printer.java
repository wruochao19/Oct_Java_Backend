package hwOne;

import java.util.*;

public class Printer {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Carter"),
                new Student("David"),
                new Student("Ellen")
        };

        for (int i=0; i < students.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("请输入学生%d的成绩: ",i+1);
            int grade = scanner.nextInt();
            students[i].setGrade(grade);
        }

        Arrays.sort(students, new Student());

        for(Student student: students)
            System.out.println(student);

    }
}
