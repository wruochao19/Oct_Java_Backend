package Day2.project;

import java.util.Scanner;
import java.util.List;
import Day2.project.service.Service;
import Day2.project.entity.Student;
import Day2.project.service.ServiceImpl;


public class Controller{

    public static void main(String[] args) {
        //接受键盘输入，并实现对数据库的CURD操作

        Scanner sc = new Scanner(System.in);
        Service service = new ServiceImpl();
        System.out.println("Add,<ID>,<NAME>,<GRADE>          //添加学生\n" +
                "Get,<ID>                         //查找学生\n" +
                "GetAll                           //按要求输出所有学生\n" +
                "Update,<ID>,<NAME>,<GRADE>       //更新学生\n" +
                "Del,<ID>                         //删除学生\n" +
                "Exit                             //结束" );
        boolean flag = true;
        while(flag){
            System.out.print("Type your operation: ");
            if(sc.hasNextLine()) {
                String input = sc.nextLine();
                String[] string = input.replaceAll("\\s", "").split(",");
                String operation = string[0];
                switch(operation){
                    case "Add":
                        service.createElement(Integer.valueOf(string[1]),new Student(string [2], Integer.valueOf(string[3])));
                        break;
                    case "Get":
                        Student student = service.getElementByKey(Integer.valueOf(string[1]));
                        System.out.println(student);
                        break;
                    case "GetAll":
                        List<Student> studentList = service.getAllElements();
                        System.out.println(studentList.toString());
                        break;
                    case "Update":
                        service.updateElementByKey(Integer.valueOf(string[1]),new Student(string [2], Integer.valueOf(string[3])));
                        break;
                    case "Del":
                        service.deleteElementByKey(Integer.valueOf(string[1]));
                        break;
                    case "Exit":
                        flag = false;
                        System.out.println("Thank you for using");
                        break;
                    default: System.out.println("Invalid operation, re-enter please");
                }
            }
        }
    }
}
