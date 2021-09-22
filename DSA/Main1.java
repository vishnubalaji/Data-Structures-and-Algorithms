import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    public static void utilStack(Scanner sc){
        String option;
        Stack<Integer> st = new Stack<Integer>();
        while(true){
            System.out.println("Choose one option.");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. isEmpty\n5. List\n6. Exit");
            option = sc.next();
            switch(option){
                case "1" :
                    System.out.println("Enter the element to be pushed");
                    int element = sc.nextInt();
                    st.push(element);
                    System.out.println("Successfully pushed");
                    break;
                case "2" :
                    System.out.println("Popped out : "+(Integer)st.pop());
                break;
                case "3" :
                    System.out.println("Take a peek : "+(Integer)st.peek());
                    break;
                case "4" :
                    System.out.println("Is it famished? : "+st.empty());
                    break;
                case "5" :
                    System.out.println(st);
                    break;
                case "6" :
                System.exit(0);
                break;

                default:
                System.out.println("That ain't an option buddy");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        utilStack(sc);
    }
}
