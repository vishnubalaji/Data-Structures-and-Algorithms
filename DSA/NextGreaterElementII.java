import java.util.Stack;
import java.util.HashMap;
public class NextGreaterElementII {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        Stack<Integer> st = new Stack<Integer>();
        int next=0, element, length = nums.length, index = 1;
        
        int [] arr = new int[length];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        st.push(nums[0]);
        for(;index<length;index++){
            next = nums[index];
            if(!st.isEmpty()){
                element = st.pop();
                while(element<next){
                    hm.put(nums[index],next);
                    if(st.isEmpty()){
                        break;
                    }
                    element = st.pop();
                }
                if(element>next){
                    st.push(element);
                }
            }
            st.push(next);
        }
        
        while(!st.isEmpty()){
            hm.put(st.pop(),-1);
        }

        st.clear();
        element = nums[length-1];
        boolean status =true;
        for(index=0;index<length-1;index++){
            arr[index] = hm.get(nums[index]);
            if(element<nums[index] && status){
                arr[length-1] = nums[index];
                status = false;
            }
        }
        if(status==true){
            arr[length-1] = -1;
        }
        System.out.println(hm);
        for(int i:arr){
            System.out.println(i);
        }
    }
}