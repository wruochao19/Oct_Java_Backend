package hw2;

import java.util.Scanner;

/**
 * @author Carter Du
 * Valid Commands:
 * add/1/Kobe/24
 * get/all  |   get/1
 * update/1/Jordan/23
 * //delete/1
 */
public class UserApplication {
    private static boolean END=false;   //'END' command will terminate the program

    public static void main(String[] args) {
        System.out.println("program initialize ...");
        Controller controller = new Controller();
        /**
         * 接受键盘输入，并实现对数据库的CURD操作
         */
        while (!END) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter the command: ");
            String command=scanner.next();
            String[] commandSeparator=command.split("/");
            switch (commandSeparator[0]) {
                case "add": {   //ex: add/55/Du
                    int id=Integer.parseInt(commandSeparator[1]);
                    String name=commandSeparator[2];
                    int grade = Integer.parseInt(commandSeparator[3]);
                    Student student=new Student();
                    student.setName(name);
                    student.setGrade(grade);
                    controller.addStudent(id, student);
                    break;
                }
                case "get":     //get/all  |   get/1
                    String keyword = commandSeparator[1];
                    if(keyword.equals("all"))
                        controller.getStudent().forEach(System.out::println);
                    else{
                        int id = Integer.parseInt(keyword);
                        System.out.println(controller.getStudentWithID(id));
                    }
                    break;

                case "update":      //update/1/Jordan/23
                    int id = Integer.parseInt(commandSeparator[1]);
                    String name = commandSeparator[2];
                    int grade = Integer.parseInt(commandSeparator[3]);
                    Student updatedStudent = new Student(name, grade);
                    controller.updateStudentWithID(id, updatedStudent);
                    break;

                case "delete":  //delete/1
                    int studentIDToBeDeleted = Integer.parseInt(commandSeparator[1]);
                    controller.deleteStudentByID(studentIDToBeDeleted);
                    break;

                case "end":
                    END=true;
                    break;
                default:
                    System.out.println("Invalid Command!");
                    break;
            }
        }
    }
}
