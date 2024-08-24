import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // 1. ใช้ scanner เพื่อรับค่า input
        Scanner scanner = new Scanner(System.in); //ใช้รับ input
        System.out.println("enter your name");
        // String name = scanner.next(); // จะรับแค่ค่าไปจนถึง whiteSpace เท่รนั้น หลังจากนั้นไม่มีค่า
        String myName = scanner.nextLine(); // จะรับค่าทั้งบรรทัด
        System.out.println(myName);

        // 2. ใช้ inputStreamReader เพื่อรับค่า input (เร็วกว่า)
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);
        System.out.println("enter your info");
        String info = br.readLine();
    }
}