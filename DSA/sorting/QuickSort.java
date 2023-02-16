import java.util.Scanner;
import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] A, int start, int end){
        int pivot = A[end];
        int partition_index = start;
        for(int i=start;i<end;i++){
            if(A[i]<=pivot){
                int temp = A[i];
                A[i] = A[partition_index];
                A[partition_index] = temp;
                partition_index++;
            }
        }
        int temp = A[partition_index];
        A[partition_index] = A[end];
        A[end] = temp;
        return partition_index;
    }

    public static void quickSort(int[] A, int start, int end){
        if(start < end){
            int partition_index = partition(A, start, end);
            quickSort(A, start, partition_index-1);
            quickSort(A, partition_index+1, end);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        
        int len = sc.nextInt();
        int[] arr = new int[len];
        
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        
        /*
        Quick sort complexity 
        Worst case --> O(n*logn) && Best case --> O(n^2)
        In-place sorting algo
        Most sort() functions use quick sort
        */
        long start = System.nanoTime();
        
        quickSort(arr, 0, len-1);

        long end = System.nanoTime();
        System.out.println("Sorted array : " + Arrays.toString(arr));
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
    }
}
