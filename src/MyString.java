import java.util.Arrays;

public class MyString {
    public static void main(String[] args) {
        String myStr = "Hello"; // declare String
        myStr = "Hi"; // reassign
        myStr = myStr.concat(", guy"); // reassign by concat
        String newStr = myStr.concat(" bye."); // declare newStr

        char[] myChar = newStr.toCharArray(); // convert String to char[]
        int[] my = {1,2,3,4};
        System.out.println(my); // ได้ reference ต้องใช้ Arrays.toString()
        System.out.println(myChar); // java แปลงมาเป็น string ให้อัตโนมัติ
        System.out.println(Arrays.toString(myChar)); // ได้เป็น array ของอักษรทีละตัว



        StringBuilder stbd = new StringBuilder("MY");
        stbd.append(" name");
        stbd.append("is john.");
        System.out.println(stbd); // My name is john.

        String multiLine =
                """
                Hello, every one.
                I'm john.
                """;


    }

}
