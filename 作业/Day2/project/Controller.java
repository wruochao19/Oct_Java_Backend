import javax.xml.ws.Service;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        /**
         * 接受键盘输入，并实现对数据库的CURD操作
         */
        Service service = new Service();
        Scanner scanner = new Scanner((System.in));
        while (true) {
            if(scanner.hasNext()){
                String input = scanner.next();
                System.out.println("键盘侠"+ input);
                String [] s = input.split(",");
                if("add".equals(s[0])){
                    service.updateElementByKey(s[1],s[2]);
                    System.out.println("添加成功");
                } else if ("get".equals(s[0])){
                    Student student = service.getElementByKey(Integer.parseInt(s[1]));
                    System.out.println(student);
                } else if ("getAll".equals(s[0])){

                }
            }
        }
    }
}
//Add,<ID>,<NAME>,<GRADE>          //添加学生
//Get,<ID>                         //查找学生
//GetAll                           //按要求输出所有学生
//Update,<ID>,<NAME>,<GRADE>       //更新学生
//Del,<ID>                         //删除学生