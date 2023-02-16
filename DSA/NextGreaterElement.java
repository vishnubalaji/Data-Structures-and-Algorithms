import java.util.Stack;

public class NextGreaterElement {
    public static void ngeExec(int a[]){
        Stack<Integer> st = new Stack<Integer>();
        
        int index = 1, next, element, length = a.length;
        st.push(a[0]);
        for(;index<length;index++){
            next = a[index];
            if(st.isEmpty()==false){
                element = st.pop();
                while(element<next){
                    System.out.println(element+"-->"+next);
                    if(st.isEmpty()==true){
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

        while(st.isEmpty()==false){
            System.out.println(st.pop()+"-->-1");
        }

    }
    public static void main(String[] args) {
        int arr[] = {11,13,3,21};
        ngeExec(arr);
    }
}
