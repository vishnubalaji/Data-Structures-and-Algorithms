import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        
        int len = sc.nextInt();
        int[] arr = new int[len];
        
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        
        /*
        Bubble sort complexity 
        Worst case --> O(n^2) && Best case --> O(n)
        */
        long start = System.nanoTime();
        
        for(int i=0;i<len;i++){
            for(int j=0;j<len-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        long end = System.nanoTime();
        System.out.println("Sorted array : " + Arrays.toString(arr));
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
    }
}
