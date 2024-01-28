package java基础.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Xiaomin extends Student {
    // 班级id
    public int classid = 24;
    private String date = "6.24";
    String house = "322";
    static int hight = 172;

    public Xiaomin(String name, String id) {
        super(name, id);
    }

    public Xiaomin() {
        super();
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 通过对象获取类的反射
        Xiaomin xiaomin = new Xiaomin();
        Class obj1 = xiaomin.getClass();
        // 获取反射的属性
        Field field = obj1.getDeclaredField("classid");
        field.setAccessible(true);
        System.out.println(field.get(xiaomin));


        // 通过class.forNmae获取反射
        Class obj2 = Class.forName("java基础.反射.Xiaomin");
        // 反射获取类的非静态参数必须用对象获取，所以这里使用newInstance方法构造一个对象来获取后面的classid
        Object instance = obj2.newInstance();
        Field field2 = obj2.getDeclaredField("classid");
        field2.setAccessible(true);
        System.out.println(field.get(instance));
        System.out.println(obj2);


        // 类名点class方法获取反射
        Class obj3 = Xiaomin.class;
        Class obj4 = Xiaomin.class;
        Object instance2 = obj3.newInstance();
        Field field3 = obj3.getDeclaredField("date");
        field3.setAccessible(true);
        System.out.println(field3.get(instance2));
        System.out.println(Xiaomin.hight);

        // 通过反射获取父类的属性
        Class<?> son = Xiaomin.class;
        Class<?> father = son.getSuperclass();
        Object father_ins = father.newInstance();
        father.getDeclaredField("id").setAccessible(true);
        Teacher teacher = new Teacher();
        // 子类对象也可以通过反射获取父类的属性
        System.out.println(father.getDeclaredField("id").get(instance2));
        System.out.println(father.getDeclaredField("id").get(father_ins));
        // 其他对象不可以获取
//        System.out.println(father.getDeclaredField("id").get(teacher));


        // 通过反射获取类的方法
        Class my_class = Class.forName("java基础.反射.Student");
        Object student = my_class.newInstance();
        Method method = my_class.getDeclaredMethod("print",int.class);
        method.setAccessible(true);
        method.invoke(student,3);
        System.out.println(method.getParameterCount());


        // 通过反射获取构造方法
        Class father_class = Student.class;
        Constructor constructor = father_class.getDeclaredConstructor(String.class,String.class);
        Student Stu = (Student) constructor.newInstance("jel","007");
        System.out.println(Stu.getName()+" "+Stu.age);
    }



}

class Teacher{
    String id = "123";
    String string = "zhangsan";
}
