import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        
        int len = sc.nextInt();
        int[] arr = new int[len];
        
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        
        /*
        Selection sort complexity 
        Worst case --> O(n^2) && Best case --> O(n)
        */
        long start = System.nanoTime();
        
        for(int i=0 ; i<len-1 ; i++){
            int min = i;
            for(int j=i+1 ; j<len ; j++){
                
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        long end = System.nanoTime();
        System.out.println("Sorted array : " + Arrays.toString(arr));
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
    }
}
