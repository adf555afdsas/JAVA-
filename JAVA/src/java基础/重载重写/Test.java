package java基础.重载重写;

public class Test extends Father {
    public void eat(){
        System.out.println("eat");
    }

    public void eat(String name){
        System.out.println("eat");
    }
    public int eat(String name,String time){
        System.out.println("eat");
        return 0;
    }
}
