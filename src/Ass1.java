public class Ass1 {
    public static void main(String[] args) {
        String result = reverseStr("");
        System.out.println(result);
        int digit = numOfDigit("skdj333");
        System.out.println(digit);
        int u = findU("iloveuuUuu");
        System.out.println(u);
    }
    public static String reverseStr (String str){
        if(str.length()==0){
            return "";
        }
        char[] myChar = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i = str.length()-1;i>=0;  i--){
            result.append(myChar[i]);
        }
        return result.toString();
    }

    public static int numOfDigit (String str){
        int num = 0;
        for (char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                num++;
            }
        }
        return num;
    }

    public static int findU (String str){
        int result =0;
        for(char ch : str.toLowerCase().toCharArray()){
            if(ch=='u'){
                result++;
            }
        }
        return result;
    }
}
