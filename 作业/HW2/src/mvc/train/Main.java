package mvc.train;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            try
            {
                System.out.println("Please input your instruction:");
                String[] s = sc.nextLine().split(",",3);
                if(s[0].equals("break"))
                    break;
                int id = Integer.parseInt(s[1]);
                String name = "";
                if(s.length == 3)
                {
                    name = s[2];
                }
                switch(s[0]) {
                    case "insert":
                        if (controller.insertStudent(id, name))
                            System.out.printf("Student with id '%d' and name '%s' inserted successfully.\n", id, name);
                        break;
                    case "get":
                        if(controller.getStudentById(id) == null)
                            System.out.printf("No student has id %d in the system.\n",id);
                        else
                            System.out.printf("Get Student with id %d successfully. And the name is: %s.\n",
                                    id, controller.getStudentById(id).getName());
                        break;
                    case "update":
                        if(controller.updateStudent(id, name))
                            System.out.printf("Successfully updated student with id %d to the name %s.\n",id,name);
                        else
                            System.out.printf("No student has id %d that can be updated.\n",id);
                        break;
                    case "delete":
                        if(controller.deleteStudentById(id))
                            System.out.println("Delete student with id "+id+" successfully.");
                        else
                            System.out.printf("No student has id %d that can be deleted.\n",id);
                        break;
                    default:
                        System.out.println("No operation called "+s[0]+".");
                        break;
                }
            }
            catch(Exception e)
            {
                System.out.println("Input wrong.\nPlease check your input.\n" +
                        "Input should be 'operation,id,name' or 'operation,id'.");
            }

        }
    }
}
