package Day2.project;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import Day2.project.service.Service;
import Day2.project.entity.Student;
import Day2.project.service.ServiceImpl;


public class Controller{

    public static void main(String[] args) {
        //接受键盘输入，并实现对数据库的CURD操作

        Scanner sc = new Scanner(System.in);
        Service service = ServiceImpl.getInstance();
        System.out.println("Add,<ID>,<NAME>,<GRADE>          //添加学生\nGet,<ID>                         //查找学生\nGetAll                           //按要求输出所有学生\nUpdate,<ID>,<NAME>,<GRADE>       //更新学生\nDel,<ID>                         //删除学生\nExit                             //结束" );
        try {
            boolean flag = true;
            while (flag) {
                System.out.print("Type your operation: ");
                if (sc.hasNextLine()) {
                    String input = sc.nextLine();
                    String[] string = input.replaceAll("\\s", "").split(",");
                    String operation = string[0];
                    switch (operation.toLowerCase(Locale.ROOT)) {
                        case "add":
                            if (string.length == 4) {
                                service.createElement(Integer.valueOf(string[1]), new Student(string[2], Integer.valueOf(string[3])));
                            } else {
                                System.out.println("Invalid Add operation");
                            }
                            break;
                        case "get":
                            if (string.length == 2) {
                                Student student = service.getElementByKey(Integer.valueOf(string[1]));
                                System.out.println(student);
                            } else {
                                System.out.println("Invalid Get operation");
                            }
                            break;
                        case "getall":
                            if (string.length == 1) {
                                List<Student> studentList = service.getAllElements();
                                System.out.println(studentList.toString());
                            } else {
                                System.out.println("Invalid GetAll operation");
                            }
                            break;
                        case "update":
                            if (string.length == 4) {
                                service.updateElementByKey(Integer.valueOf(string[1]), new Student(string[2], Integer.valueOf(string[3])));
                            } else {
                                System.out.println("Invalid Update operation");
                            }
                            break;
                        case "del":
                            if (string.length == 2) {
                                service.deleteElementByKey(Integer.valueOf(string[1]));
                            } else {
                                System.out.println("Invalid Del operation");
                            }
                            break;
                        case "exit":
                            flag = false;
                            System.out.println("Thank you for using");
                            break;
                        default:
                            System.out.println("Invalid operation, re-enter please");
                    }
                }
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
