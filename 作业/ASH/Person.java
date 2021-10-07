package ASH;

public class Person {
    private String name;
    private int grade;
    public Person(){
        System.out.println("无名之辈");
    }
    public Person(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
