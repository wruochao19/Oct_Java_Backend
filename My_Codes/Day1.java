import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args){

     Student[] students = new Student[]{new Student("a"), new Student("b"), new Student("c")};
        
     Scanner sc = null;
        
     for(int i = 0; i < students.length; i++){
         sc = new Scanner(System.in);
         System.out.printf("请输入学生%d的成绩：", i+1);
         int grade = sc.nextInt();
         students[i].setGrade(grade);
     }
        
     //sort students by grades from high to low
     Arrays.sort(students,new Comparator<Student>(){
         @Override
         public int compare(Student o1, Student o2) {
             return Integer.valueOf(o2.getGrade()).compareTo(Integer.valueOf(o1.getGrade()));
         }
     });
        
     //print students info
     for (Student student : students){
         System.out.println(student);
     }
        
     sc.close();
   }
}
