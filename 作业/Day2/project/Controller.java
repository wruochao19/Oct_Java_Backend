package Day2.project;
import entity.Student;
import Day2.project.service.ServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Controller {
    ServiceImpl service=new ServiceImpl();
    public void add(int id, String name, int grade) {
        service.createElement(id, new Student(name, grade));
    }
    public Student get(int id){
        return service.getElementByKey(id);
    }
    public List<Student> getAllElements(){
        return service.getAllElements();
    }
    public void update(int id, String name, int grade){
        service.updateElementByKey(id,new Student(name,grade));
    }
    public void delete(int id){
        service.deleteElementByKey(id);
    }


    public static void main(String[] args) {
        /**
         * 接受键盘输入，并实现对数据库的CURD操作
         */
        Controller controller=new Controller();
        Scanner sc=new Scanner(System.in);
        System.out.println("Add,<ID>,<NAME>,<GRADE>          //添加学生\nGet,<ID>                         //查找学生\nGetAll                           //按要求输出所有学生\nUpdate,<ID>,<NAME>,<GRADE>       //更新学生\nDel,<ID>                         //删除学生\nExit                             //结束" );
        while (true){
            System.out.println("key in");
            String[] keyin=sc.nextLine().split(",");
            if (keyin[0].equals("Exit")) break;
            switch(keyin[0]){
                case "Add":
                case "Update":
                    int id=Integer.parseInt(keyin[1]);
                    String name=keyin[2];
                    int grade=Integer.parseInt(keyin[3]);
                    if (keyin[0].equals("Add")) controller.add(id,name,grade);
                    else controller.update(id,name,grade);
                    break;
                case "GetAll":
                    List<Student> students=controller.getAllElements();
                    for(Student s: students){
                        System.out.println(s);
                    }
                    break;
                case "Get":
                    Student s=controller.get(Integer.parseInt(keyin[1]));
                    System.out.println(s);
                case "Del":
                    controller.delete(Integer.parseInt(keyin[1]));
                    break;
                default:
                    System.out.println("Cannot recognize commands");
            }
        }
        }
    }

