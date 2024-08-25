import java.util.Arrays;

public class Assingment2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        isSort(arr);
//        isPalin(arr);
        int num = findMedian(arr);
        System.out.println(num);
        Integer[] IntArr = {2,3,5,7,11,13};
        isPrime(IntArr);
    }

    public static void isSort (int[] arr){
        int[] sortArr = Arrays.stream(arr).sorted().toArray();
        boolean isAlreadySort = Arrays.equals(arr,sortArr);
        System.out.println(isAlreadySort);
        System.out.println(Arrays.toString(sortArr));
    }

    public static void isPalin (int[] arr){
        int last = arr.length -1;
        boolean isEqual = true;
        for (var i = 0 ; i<arr.length/2; i++){
            if(arr[i]!=arr[last]){
                isEqual = false;
                break;
            }
            last--;
        }
        System.out.println(isEqual);
    }

    public static void isPrime (Integer[] arr){
        boolean isPrime = true;
        for(var num : arr){
            if(num<=1){
                isPrime=false;
                break;
            }
            for(int i=2; i<Math.sqrt(num); i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("this Integer[] is " + isPrime);
    }

    public static void primeInRange (Integer[] arr){

    }

    public static int findMedian (int[] arr){
        var sortArr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(sortArr));
        int idx = sortArr.length;
        if(idx%2!=0){
            return sortArr[(sortArr.length/2)];
        }else {
            return (sortArr[sortArr.length/2] + sortArr[sortArr.length/2-1])/2;
        }
    }
}
