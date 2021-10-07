public class Student extends Person{

    private int grade;

    public Student(){

    }
    public Student(String name) {
        super(name);
    }
    public Student(int grade){
        this.grade = grade;
    }
    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void sortArrayByGrade(Student[] students){
        // bubble sort
        for(int i = students.length - 1; i >= 0; i--){
            for(int j = i - 1; j >= 0; j--){
                if (students[i].getGrade() > students[j].getGrade()){
                   Student temp = students[j];
                   students[j] = students[i];
                   students[i] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + "'" + getName() + "'" +", "+
                "grade=" + getGrade() +
                '}';
    }
}
