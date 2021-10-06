package Day1;

import java.util.Scanner;

public class Day1Main {
    public static void bubbleSort(Student[] students) {
        for (int i=0;i< students.length;i++) {
            for (int j=1;j<students.length-i;j++) {
                if (students[j-1].getGrade()<students[j].getGrade()) {
                    Student temp=students[j-1];
                    students[j-1]=students[j];
                    students[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("a"),
                new Student("b"), new Student("c")};

        for (int i=0;i<students.length;i++) {
            Scanner sc= new Scanner(System.in);
            System.out.printf("请输入学生%d的成绩:",i+1);
            int input=sc.nextInt();
            students[i].setGrade(input);
        }
        bubbleSort(students);
        for(Student student: students){
            System.out.println(student);
        }
    }
}
