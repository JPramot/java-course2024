public class Selection {
    public static void main(String[] args) {
        int recur = recursive(5);
        System.out.println(recur);
    }

    private static void ifElse (String light){

        int speed = 50;
        if(light.equalsIgnoreCase("green")){
            speed += 20;
        }else if(light.equalsIgnoreCase("yellow")){
            speed -= 20;
        } else if (light.equalsIgnoreCase("red")) {
            speed =0;
        }
    }

    private static void iteration (String day){
        switch (day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("not holiday");
            case "Saturday","Sunday" -> System.out.println("holiday");
            default -> System.out.println("wrong input");
        }
    }

    // recursive จะทำงานจนจบเงื่อนไขก่อนถึงจะเริ่มทำการคืนค่า
    // recursiveValue = recursive(2)
    // recursiveValue = recursive(1)
    // recursiveValue = recursive(0) => print recursive : 0 return 1 to recursiveValue = recursive(1)
    // print recursive : 1 return 2 to recursiveValue = recursive(2)
    // print recursive : 2 return 3 out the method
    public static int recursive (int count){
        if(count < 0){
            return 0;
        }
        if(count==0){
            return 0;
        }
        var recursiveValue = recursive(count-1);
        System.out.println("recursive : " + recursiveValue);
        return recursiveValue+1;
    }
}
