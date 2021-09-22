import stack.Stack;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        String option;
        while(true){
            System.out.println("Choose one option.");
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