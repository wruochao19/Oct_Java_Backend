import entity.Student;
import service.Service;
import service.ServiceImpl;

import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        /**
         * 接受键盘输入，并实现对数据库的CURD操作
         * Add,<ID>,<NAME>,<GRADE>          //添加学生
         * Get,<ID>                         //查找学生
         * GetAll                           //按要求输出所有学生
         * Update,<ID>,<NAME>,<GRADE>       //更新学生
         * Del,<ID>                         //删除学生
         */
        Service service = new ServiceImpl();
        Scanner sc = new Scanner(System.in);
        Student student = null;
        System.out.println("输入指令");

        while(true){
            String input = sc.nextLine();
            String[] command = input.split(",");
            switch (command[0]){
                case "Get":
                    System.out.println(service.getElementByKey(Integer.valueOf(command[1])));
                    break;
                case "GetAll":
                    System.out.println(service.getAllElements());
                    break;
                case "Del":
                    service.deleteElementByKey(Integer.valueOf(command[1]));
                    break;
                case "Add":
                    student = new Student(command[2],Integer.valueOf(command[3]));
                    service.createElement(Integer.valueOf(command[1]),student);
                    break;
                case "Update":
                    student = new Student(command[2],Integer.valueOf(command[3]));
                    service.updateElementByKey(Integer.valueOf(command[1]),student);
                    break;
                case "Exit":
                    return;
                default:
                    System.out.println("invalid command");
            }

        }
    }
}
