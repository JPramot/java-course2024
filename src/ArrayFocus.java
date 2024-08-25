public class ArrayFocus {

    public static void main(String[] args) {
        // if you want to declare array without value you must reserve number of slot
        // it call initialize with slot
        int[] arr = new int[10];
        for (var n : arr){
            System.out.println(n); // value = 0
        }
        Integer[] intArr = new Integer[10];
        for(var n : intArr){
            System.out.println(n); // value = null
        }

        arr[0] = 111; // assign value to index
        System.out.println(arr[0]); // access value of index

        // Combine initialization with assign value
        int[] arr2 = new int[]{1,2,3,4}; // size = 4

        // Declare array with value
        String[] exampleArr = {"john","jim","joe","john"};
    }
}
