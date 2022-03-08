import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        
        int len = sc.nextInt();
        int[] arr = new int[len];
        
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        
        /*
        Insertion sort complexity 
        Worst case --> O(n^2) && Best case --> O(n)
        */
        long start = System.nanoTime();
        
        for(int i=1;i<len;i++){
            int value = arr[i];
            int hole = i;

            while(hole>0 && arr[hole-1] > value){
                arr[hole] = arr[hole-1];
                hole = hole-1;
            }

            arr[hole] = value;
        }
        long end = System.nanoTime();
        System.out.println("Sorted array : " + Arrays.toString(arr));
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
    }
}
