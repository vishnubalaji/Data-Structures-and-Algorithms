import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int length = arr.length, index = 1, next;
        int[] result = new int[length];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        result[0] = 1;

        for(;index<length;index++){
            next = arr[index];
            System.out.println(next);
            while( !stack.empty() && arr[stack.peek()]>=next ){
                result[index] = (index)-stack.peek();
                stack.pop();
            }
            stack.push(index);
        }
        for(int i:result){
            System.out.println(i);
        }
    }
}