import stack.Stacky;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

class Main{
    public static void manualStack(Scanner sc){
        Stacky s = new Stacky();
        String option;
        System.out.println("Choose one option.");
        System.out.println("1. Implemented Stack\n2. Pre-defined Stack\n3. Queue\n4. LinkedList\n5. Exit");
        String outer_option;
        outer_option = sc.next();
        if(outer_option.equals("1")){
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
        else if(outer_option.equals("2")){
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
        else if(outer_option.equals("3")){
            Queue<Integer> queue = new LinkedList<Integer>();
            while(true){
                System.out.println("Choose one option.");
                System.out.println("1. Enqueue\n2. Dequeue\n3. Peek\n4. isEmpty\n5. Exit");
                option = sc.next();
                switch(option){
                    case "1" :
                        System.out.println("Enter the element to be enqueued");
                        int element = sc.nextInt();
                        queue.add(element);
                        System.out.println("Successfully enqueued");
                        break;
                    case "2" :
                        try{
                            System.out.println("Dequeued : "+(Integer)queue.remove());
                        }
                        catch(Exception e){
                            System.out.println("Exception encountered dear");
                        }
                    break;
                    case "3" :
                        System.out.println("Take a peek : "+(Integer)queue.peek());
                        break;
                    case "4" :
                        System.out.println("Is it famished? : "+queue.isEmpty());
                        break;
                    case "5" :
                        System.exit(0);
                    break;

                    default:
                    System.out.println("That ain't an option buddy");
                }
            }
        }
        else if(outer_option.equals("4")){
            LinkedList<Integer> list = new LinkedList<Integer>();
            while(true){
                System.out.println("Choose one option.");
                System.out.println("1. Add\n2. Remove\n3. Update\n4. List\n5. Exit");
                option = sc.next();
                switch(option){
                    case "1" :
                        System.out.println("Enter the element to be added");
                        int element = sc.nextInt();
                        list.add(element);
                        System.out.println("Successfully added");
                        break;
                    case "2" :
                        try{
                            System.out.println("Enter the index of the element to be removed");
                            int remove = sc.nextInt();
                            list.remove(remove);
                            System.out.println("Removed");
                        }
                        catch(Exception e){
                            System.out.println("Exception encountered dear");
                        }
                    break;
                    case "3" :
                        try {
                            System.out.println("Enter the index and the element to be updated");
                            int index = sc.nextInt();
                            int ele = sc.nextInt();
                            list.set(index,ele);
                            System.out.println("Updated");
                            break;
                        } catch (Exception e) {
                            System.out.println("Exception encountered dear");
                        }
                    case "4" :
                        for(int i=0;i<list.size();i++){
                            System.out.println(list.get(i));
                        }
                        break;
                    case "5" :
                        System.exit(0);
                    break;

                    default:
                    System.out.println("That ain't an option buddy");
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        manualStack(sc);
    }
}