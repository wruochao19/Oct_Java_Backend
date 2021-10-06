package Day1;

public class Student {
    private String name;
    private int grade;

    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{ name='"+getName()+"', grade="+getGrade() +"}";
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
