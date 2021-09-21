// Operations in stack are
// 1. push
// 2. pop
// 3. peek
// 4. isEmpty
package stack;

public class Stack{
    static final int MAX = 1000;
    int top;
    int array[] = new  int[MAX];

    Stack(){
        top = 0;
    }

    public void push(int element){
        if(top==(MAX-1)){
            System.out.println("stack overflow!");
        }
        else{
            array[top] = element;
            ++top;
        }
    }

}