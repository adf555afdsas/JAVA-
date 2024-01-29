package java基础.String相关;

public class Test_new_dqutation {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = new String("hello");

        System.out.println(str1 == str3);// true
        System.out.println(str1 == str2);// false
        System.out.println(str2 == "hello"); // false 等价于：str2=str1
        str2=str1;
        System.out.println(str2 == "hello");// true


        // 字符串reverse
        StringBuffer str5 = new StringBuffer("123456");
        StringBuilder str6 = new StringBuilder("123");
        System.out.println(str5.reverse());
        System.out.println(str6.reverse());
        System.out.println(2<<3);
    }
}
