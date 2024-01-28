package java基础.抽象类接口区别;

public class Dog extends Animal{
    int a;
    private String name = "outer";
    public Dog(int name, int age,int b) {
        super();

    }

    public Dog() {

    }

    public void sit(){
        class jub{
            public  void main(String[] args) {
                System.out.println(name);
            }
        }
        Inner inr = new Inner();
        inr.sit();
    }

    // 创建一个成员内部类
    class Inner{
//        String name = "inner";
        public void sit(){
            Inner inr = new Inner();
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sit();
    }


}
