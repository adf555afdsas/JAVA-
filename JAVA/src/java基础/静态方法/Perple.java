package java基础.静态方法;

public class Perple {
    static void print(){
        System.out.println("hello");
    }

    void print2(){
        Perple perple = new Perple();
        perple.print();
        System.out.println("hello not static");
    }

    public static void main(String[] args) {
        Perple perple = new Perple();
        perple.print2();
    }
}
