package prictice2;

public class Person {
    static  String name;
    static protected int age = 0;

    public Person(String name, int age) {
         this.name = name;
        this.age = 11;
        System.out.println("superrrrrr");
    }

    public Person() {
        System.out.println("1111111111111");
    }

    @Override
    public int hashCode() {
        return name.hashCode(); // 根据名字计算哈希码值
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
    public static void say1(){
        System.out.println("i am father");
    }

    public static void main(String[] args) {
        short a = 1;

    }
}