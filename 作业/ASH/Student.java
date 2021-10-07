package ASH;

public class Student extends Person{
    private int grade;
    public Student(String name){
        super(name);
    }
    public Student(){};
    public void setGrade(int grade){
        this.grade=grade;
    }
    public int getGrade(){
        return this.grade;
    }
    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("Student{name=\'");
        builder.append(getName());
        builder.append("\', grade=");
        builder.append(String.valueOf(this.grade));
        builder.append('}');
        return builder.toString();
    }


}
