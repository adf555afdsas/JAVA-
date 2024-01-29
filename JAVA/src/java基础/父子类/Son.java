package java基础.父子类;

public class Son extends Father{
    public void getsuper(){
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        new Son().getsuper();
    }
}
