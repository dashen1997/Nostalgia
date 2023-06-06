package Algorithm;




public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,3,9,22,67,43,21};
        quickS1(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        }



    public static void quickS1(int[] arr, int a, int b){
          if (a > b){
              return;
          }
          int start = a;
          int end = b;
          while (start != end ){
        while (start != end && arr[a] >= arr[start]){
            start++;
        }
        while (start != end && arr[a] <= arr[end]){
            end--;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
          }
          if (start == b && arr[start] <= arr[a]){
              int temp = arr[a];
              arr[a] = arr[start];
              arr[start] = temp;
              quickS1(arr,a,start-1);
          }else {
              int temp = arr[a];
              arr[a] = arr[start-1];
              arr[start-1] = temp;
              quickS1(arr,start,b);
              quickS1(arr,a,start-2);
          }

        }

    public static void quickS2(int[] arr, int a, int b){
        if (a > b){
            return;
        }
        int start = a;
        int end = b;
        while (start != end ){
            while (start != end && arr[a] <= arr[end]){
                end--;
            }
            while (start != end && arr[a] >= arr[start]){
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
            int temp = arr[a];
            arr[a] = arr[start];
            arr[start] = temp;
            quickS2(arr,a,start-1);
            quickS2(arr,start+1, b);
        }

    }





