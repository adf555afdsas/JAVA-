package java基础.抽象类接口区别;

public abstract class Animal {
    String name = "Dahuang";
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {

    }

    public void eat(){
    }

    private void sit() {

    }

    class inner{
        int name;
        public void laugh(){

        }
    }

}
