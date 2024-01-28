package java基础.反射;

public class Student {
    private String name = "xiaoming";
    public int age = 18;
    String id = "201806024222";

    public String getName() {
        return name;
    }

    public Student() {

    }

    private void print(int a){
        System.out.println("hello 反射");
    }

    public Student(String name, String id){
        this.name= name;
        this.id = id;
    }
}
