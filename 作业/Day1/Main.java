package Day1;
import java.util.*;

public class Main {

    public static void generateGrade(Student[] students){
        for(Student s: students){
            Scanner sc = new Scanner(System.in);
            boolean flag = true;
            while(flag){
                if (s.getGrade()==0) {
                    System.out.print("Student " + s.getName() + "'s grade: ");
                    try {
                        int grade = sc.nextInt();
                        if (grade >= 0 && grade <= 100) {
                            s.setGrade(grade);
                            flag = false;
                        } else {
                            System.out.print("A normal student has a grade between 0 and 100\n");
                        }
                    }catch(Exception e){
                        System.out.println("Input must be a integer");
                        sc.nextLine();
                    }
                }else{
                    System.out.println("Student " + s.getName() + " already has a grade " + s.getGrade());
                    flag = false;
                }
            }
        }
    }

    public static void main (String[] args){
        // initialize students
        Student [] students = new Student[]{new Student("a"), new Student("b"), new Student("c"), new Student(200), new Student("e",100)};

        // set name if grade is larger than 100 or name is NULL
        for(Student s: students){
            String name = String.valueOf(s.getName()).equals("null") & s.getGrade() > 100 ? "God" : s.getName();
            s.setName(name);
        }

        // generate grades
        generateGrade(students);

        // sort students by grade
        Student s = new Student();
        s.sortArrayByGrade(students);

        // output student's info
        System.out.println("\nStandard Output");
        for(Student st: students){
            System.out.println(st.toString());
        }
    }
}
