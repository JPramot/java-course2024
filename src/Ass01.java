import java.util.Scanner;

public class Ass01 {
    public static void main(String[] args) {
//        oddOrEven();
//        int fac = recursive(5);
//        System.out.println(fac);
        avg();
    }
    public static void oddOrEven (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number : ");
        try {
        int myNum = scanner.nextInt();
        if(myNum%2==0){
            System.out.println(myNum + " is even number");
        }else {
            System.out.println(myNum + " is odd number");
        }
        } catch (Exception e) {
            System.out.println("Error it not a number");
        }

    }

    public static void checkLarge (){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do{
            System.out.print("please enter your number : ");
            try {
            int input = scanner.nextInt();
            if(input<0) {
                break;
            }
            if(input>num) {
                num = input;
            }
            } catch (Exception e) {
                System.out.println("error pleas enter only positive number");
            }

        }while (true);
        System.out.println("this is the biggest number : " + num);
    }

    public static int recursive (int num){
        if(num==1){
            return 1;
        }
        return num * recursive(num-1);
    }

    public static void avg (){
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i<10; i++){
            System.out.println("please number " + (i+1) + " : ");
            int input = scanner.nextInt();
            result += input;
        }
        double avg = (double) result /10;
        System.out.println(avg);
    }

}
