package java基础.内部类;

public class Monkey {
    String name = "wukong";
    public void weat( Animal animal){
        animal.eat();
    }

    // 定义一个局部内部类
    public void jump(){
        int distance = 10;
        class inner{
            public void main() {
                System.out.println(distance);
            }
        }
        inner inr = new inner();
        inr.main();
    }

    public static void main(String[] args) {
        int age = 11;
        Monkey monkey = new Monkey();
        monkey.weat(new Animal() {
            @Override
            void eat() {
                System.out.println(age);
                System.out.println("动物在吃草");
            }
        });

        monkey.jump();
    }
}
