package java基础.String相关;

public class Test_string {
    char chr = 'c';
    String str = "abc";
    String str2 = "";

    public static void main(String[] args) {
        Test_string test_string = new Test_string();
        System.out.println(test_string.chr);
        System.out.println(test_string.str.toCharArray().length);
        System.out.println(test_string.str2.toCharArray().length);
        System.out.println(test_string.str.substring(1,2));
    }

}
