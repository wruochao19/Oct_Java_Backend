public class Student {
    private String name;
    private Integer grade;

    public Student(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String setName(String name){
        return this.name = name;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public Integer setGrade(Integer grade) {
        return this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
