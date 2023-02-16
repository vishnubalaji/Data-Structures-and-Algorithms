import java.util.Stack;
import java.util.HashMap;
public class NextGreaterElementII {
    public static void main(String[] args) {
        int [] nums = {1,2,1};
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        int i = 2*nums.length-1;
        for(;i>=0;--i){
            while(!stack.empty() && nums[stack.peek()] <= nums[i%nums.length]){
                stack.pop();
            }
            res[i%nums.length] = stack.empty() ? -1 : nums[stack.peek()];
            stack.push(i % nums.length);
        }
        for(int i:res){
            System.out.println(i);
        }
}