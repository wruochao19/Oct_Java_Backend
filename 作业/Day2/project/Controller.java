package project;

import project.entity.Student;
import project.service.ServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Controller {

    private ServiceImpl impl = new ServiceImpl();

    //添加学生 Add,<ID>,<NAME>,<GRADE>
    public void add(int id,String name,int grade){
        impl.createElement(id,new Student(name,grade));
    }

    //查找学生 Get,<ID>
    public Student get(int id){
        return impl.getElementByKey(id);
    }

    //查找所有学生,按成绩降序排序，若成绩一致按名字升序排序
    public List<Student> getAll(){
        return impl.getAllElements();
    }

    //更新学生 Update,<ID>,<NAME>,<GRADE>
    public void update(int id, String name, int grade){
        impl.updateElementByKey(id,new Student(name,grade));
    }


    //删除学生 Del,<ID>
    public void del(int id){
        impl.deleteElementByKey(id);
    }


    public static void main(String[] args) {
        /**
         * 接受键盘输入，并实现对数据库的CURD操作
         */
        Controller ctr = new Controller();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("输入指令(输入Help查看帮助):");
            try {
                String res = sc.next().trim();
                if (res.equals("GetAll")){
                    List<Student> allStudent = ctr.getAll();
                    if (allStudent.size() == 0){
                        System.out.println("The database is empty,use Add to create new record");
                    }
                    else{
                        for (Student i:allStudent){
                            System.out.println(i);
                        }
                    }
                }
                else if (res.equals("Help")){
                    System.out.println("指令区分大小写，其中ID和Grade必须为整型，格式如下\nAdd,<ID>,<NAME>,<GRADE>          //添加学生 \n" +
                            "Get,<ID>                         //查找学生\n" +
                            "GetAll                           //按要求输出所有学生\n" +
                            "Update,<ID>,<NAME>,<GRADE>       //更新学生\n" +
                            "Del,<ID>                         //删除学生\n"+
                            "Exit                             //退出(数据会丢失)");
                }
                else if (res.equals("Exit")){
                    System.out.println("GoodBye!");
                    break;
                }
                else {
                    String[] params = res.split(",");
                    if (params.length == 2){
                        int id = Integer.parseInt(params[1]);
                        if (params[0].equals("Del")){
                            ctr.del(id);
                        }
                        else if (params[0].equals("Get")){
                            Student stu = ctr.get(id);
                            if (stu==null){
                                System.out.println("Id not found");
                            }
                            else {
                                System.out.println(stu);
                            }
                        }
                        else{
                            throw new Exception("指令格式错误");
                        }
                    }
                    else if (params.length == 4){
                        int id = Integer.parseInt(params[1]);
                        String name = params[2];
                        int grade = Integer.parseInt(params[3]);
                        if (params[0].equals("Add")){
                            ctr.add(id,name,grade);
                        }
                        else if (params[0].equals("Update")){
                            ctr.update(id,name,grade);
                        }
                        else{
                            throw new Exception("指令格式错误");
                        }
                    }
                    else{
                        throw new Exception("指令格式错误");
                    }
                }

            }
            catch(Exception ex){
                System.out.println(ex.getMessage()+"\n错误!请检查指令");
            }
        }




    }
}
