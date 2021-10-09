package mvc.train;

import java.util.Scanner;

public class Main {
    static Controller controller = new Controller();
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            try
            {
                System.out.println("Please input your instruction:");
                String[] s = sc.nextLine().split(",",4);
                if(s[0].equals("End"))
                    break;
                switch(s[0]) {
                    case "Add":
                        main.Add(s);
                        break;
                    case "Get":
                        main.Get(s);
                        break;
                    case "GetAll":
                        main.GetAll();
                        break;
                    case "Update":
                        main.Update(s);
                        break;
                    case "Del":
                        main.Delete(s);
                        break;
                    default:
                        System.out.println("No operation called "+s[0]+"."+" Please check your input.");
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

    private void Add(String[] s)
    {
        int id = Integer.parseInt(s[1]);
        String name = s[2];
        int grade = Integer.parseInt((s[3]));
        if (controller.insertStudent(id, name,grade))
            System.out.printf("Student with id '%d', name '%s', and grade '%d' inserted successfully." +
                    "\n", id, name,grade);
    }

    private void Get(String[] s)
    {
        int id = Integer.parseInt(s[1]);
        if(controller.getStudentById(id) == null)
            System.out.printf("No student has id '%d' in the system.\n",id);
        else
            System.out.printf("Get Student with id '%d' successfully. The name is: '%s' and the" +
                            "grade is '%d'.\n", id, controller.getStudentById(id).getName(),
                    controller.getStudentById(id).getGrade());
    }

    private void GetAll()
    {
        for(Student student :controller.getAllStudents())
        {
            System.out.println(student.toString());
        }
    }

    private void Update(String[] s)
    {
        int id = Integer.parseInt(s[1]);
        String name = s[2];
        int grade = Integer.parseInt((s[3]));
        if(controller.updateStudent(id, name,grade))
            System.out.printf("Successfully updated student with id '%d' to " +
                    "the name '%s' and grade '%d'.\n",id,name,grade);
        else
            System.out.printf("No student has id '%d' that can be updated.\n",id);
    }

    private void Delete(String[] s)
    {
        int id = Integer.parseInt(s[1]);
        if(controller.deleteStudentById(id))
            System.out.println("Delete student with id '"+id+"' successfully.");
        else
            System.out.printf("No student has id '%d' that can be deleted.\n",id);
    }
}
