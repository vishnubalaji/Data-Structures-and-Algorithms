import java.util.Stack;
import java.util.ArrayList;

public class MaxDiff{
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        // int arr[] = {2, 4, 8, 7, 7, 9, 3};
        // int arr[] = {5, 1, 9, 2, 5, 1, 7};
        int arr[]= {2,1,8};
        // ArrayList<Integer> arr = new ArrayList<>(2, 1, 8);
        ArrayList<Integer> left_smaller = new ArrayList<>();
        ArrayList<Integer> right_smaller = new ArrayList<>();
        // Perform left smaller and then right smaller
        int index = 1,length = arr.length,next;
        left_smaller.add(0);
        stack.push(arr[0]);
        for(;index<length;index++){
            next = arr[index];
            while(!stack.empty() && stack.peek()>=next){
                stack.pop();
            }
            left_smaller.add(stack.empty()?0:stack.peek());
            stack.push(arr[index]);
        }
        stack.clear();
        //Reversing the array
        int arr_reverse[] = new int[length],j=length;
        for (int i = 0; i < length; i++) {
            arr_reverse[j - 1] = arr[i];
            j = j - 1;
        }
        right_smaller.add(0);
        stack.push(arr_reverse[0]);
        index=1;
        for(;index<length;index++){
            next = arr_reverse[index];
            while(!stack.empty() && stack.peek()>=next){
                stack.pop();
            }
            right_smaller.add(stack.empty()?0:stack.peek());
            stack.push(arr_reverse[index]);
        }

        ArrayList<Integer> right_smaller_ = new ArrayList<>();
        for (int i = length-1; i >=0; i--) {
            right_smaller_.add(right_smaller.get(i));
        }

        System.out.println("Left smaller --> "+left_smaller);
        System.out.println("Right smaller --> "+right_smaller_);
        stack.clear();
        int great = 0;
        for(int i=0;i<length;i++){
            int diff = Math.abs(left_smaller.get(i)-right_smaller_.get(i));
            if(diff>great){
                great = diff;
            }
        }

        System.out.println(great);
    }
}