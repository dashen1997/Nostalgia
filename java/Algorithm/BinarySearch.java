package Algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,9};
       int result = bs(arr, 5, 0, arr.length-1);
       if (result == -1){
           System.out.println("NOT FOUND");
       }else {
           System.out.println("FOUND AT INDEX" + result);
       }
    }

    public static int bs(int[] arr, int x, int start, int end){
        if (start > end){
            return -1;
        }
        int y = (start + end) / 2;
        if (x == arr[y]){
            return y;
        }
        if (x > arr[y]){
            return bs(arr, x, y+1, end);
        }
        if (x < arr[y]){
            return bs(arr, x, start, y-1);
        }
        return -1;
    }




}
