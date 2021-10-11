package Day2.project.main;

import Day2.project.service.ServiceImpl;
import Day2.project.service.Service;
import Day2.project.entity.Student;

import java.util.List;
import java.util.Scanner;

public class Controller {
    private static boolean FLAG = true;
    public static void main(String[] args) {
        /**
         * 接受键盘输入，并实现对数据库的CURD操作
         */
        System.out.println(
                "Usage\n" +
                "=============================================================\n"+
                "Add,<ID>,<Name>,<Grade>             //add a student\n" +
                "Get,<ID>                            //Search a student\n" +
                "GetAll                              //Get all student info\n" +
                "Update,<ID>,<Name>,<Grade>          //Update a student info\n" +
                "Del,<ID>                            //Delete a student\n" +
                "Exit                                //Exit the program\n" +
                "============================================================="
        );
        Service service = new ServiceImpl();
        Scanner sc = new Scanner(System.in);

        while(FLAG){
            try{
                String[] input = sc.nextLine().split(",");
                switch(input[0]){
                    case "Update":
                    case "Add":
                        Student student = new Student(input[2],Integer.valueOf(input[3]));
                        if (input[0].equals("Add")){
                            System.out.println("Adding a new student.");
                            service.createElement(Integer.valueOf(input[1]),student);
                        }else{
                            System.out.println("Updating a student information.");
                            service.updateElementByKey(Integer.valueOf(input[1]),student);
                        }
                        break;
                    case "Get":
                        System.out.println("Fetching a student information.");
                        student = service.getElementByKey(Integer.valueOf(input[1]));
                        System.out.println(student);
                        System.out.println("Fetching Successfully");
                        break;
                    case "GetAll":
                        System.out.println("Printing all student information.");
                        List<Student> li = service.getAllElements();
                        for(Student s : li){
                            System.out.println(s);
                        }
                        System.out.println("Done!");
                        break;
                    case "Del":
                        System.out.println("Deleting a student information");
                        service.deleteElementByKey(Integer.valueOf(input[1]));
                        break;
                    case "Exit":
                        FLAG = false;
                        break;
                    default:
                        System.out.println("Unknown command, please type correct commands " +
                                "(Add, Get, GetAll, Update, Del or Exit.)");
                }

            }catch(Exception e){
                System.out.println(e);
                break;
            }
        }
        sc.close();

    }
}
