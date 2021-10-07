package ASH;

import com.sun.xml.internal.ws.addressing.WsaTubeHelper;

import java.util.Scanner;

public class Main {
    public static void sorted(Student[] students){
        Student temp;
        for(int right=students.length;right>0;right--){
            for(int left=1;left<right;left++){
                if (students[left].getGrade()>students[left-1].getGrade()){
                    temp=students[left];
                    students[left]=students[left-1];
                    students[left-1]=temp;
                }
            }
        }
        //return students;
    }
    public static Student[] prepare(int size){
        Student[] students=new Student[size];
        Scanner scan=new Scanner(System.in);
        int base=(int)'a';
        for (int i=0;i<size;i++){
            boolean notDone=true;
            String name=String.valueOf((char) (i+base));
            students[i]=new Student(name);
            System.out.println("输入学生"+((char)(i+base))+"的成绩");
            while(notDone){
                try {
                    int input = (int) scan.nextInt();
                    students[i].setGrade(input);
                    notDone = false;
                }catch (Exception error){
                    notDone=true;
                    System.out.println("格式有问题 请重新输入");
                    scan.nextLine();
                }
            }
        }
        System.out.println("输入完成");
        return students;


    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Student[] students=prepare(3);
        sorted(students);
        for (Student s:students){
            System.out.println(s.toString());

        }

    }
}
