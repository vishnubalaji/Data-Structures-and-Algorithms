import java.util.Scanner;

public class Stacky{
    // Operations in stack are
    // 1. push
    // 2. pop
    // 3. peek
    // 4. isEmpty
    // 5. isFull
    static final int MAX = 5;
    public static int top;
    static int array[] = new int[MAX];

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
    public static void main(String[] args) {
        Stacky s = new Stacky();
        Scanner sc = new Scanner(System.in);
        String option;
        while(true){
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. isEmpty\n5. isFull\n6. List\n7. Exit");
            option = sc.next();
            switch(option){
                case "1" :
                    System.out.println("Enter the element to be pushed");
                    int element = sc.nextInt();
                    s.push(element);
                    break;
                case "2" :
                    System.out.println("Popped out : "+s.pop());
                break;
                case "3" :
                    System.out.println("Take a peek : "+s.peek());
                    break;
                case "4" :
                    System.out.println("Is it famished? : "+s.isEmpty());
                    break;
                case "5" :
                    System.out.println("Is it full? : "+s.isFull());
                    break;
                case "6" :
                    s.list();
                    break;
                case "7" :
                    System.exit(0);
                break;

                default:
                System.out.println("That ain't an option buddy");
            }
        }
    }
}