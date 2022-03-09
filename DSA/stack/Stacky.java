package stack;

public class Stacky{
    // Operations in stack are
    // 1. push
    // 2. pop
    // 3. peek
    // 4. isEmpty
    static final int MAX = 5;
    public int top;
    int array[] = new  int[MAX];

    public Stacky(){
        top = -1;
    }

    public void push(int element){
        if(top==(MAX-1)){
            System.out.println("stack overflow!");
        }
        else{
            array[++top] = element;
            System.out.println("Successfully pushed into the stack");
        }
    }

    public int pop(){
        if(top>=0){
            return array[top--];
        }
        else{
            System.out.println("stack underflow!");
            return 0;
        }
    }

    public int peek(){
        if(top>0){
            return array[top];
        }
        else{
            System.out.println("stack underflow!");
            return 0;
        }
    }

    public boolean isEmpty(){
        if(top<0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(top==MAX-1){
            return true;
        }
        else{
            return false;
        }
    }

    public void list(){
        if(top<0){
            System.out.println("nothing to look here :(");
        }
        else{
            int i=0;
            for(;i<=top;i++){
                System.out.println(array[i]);
            }
        }
    }
}