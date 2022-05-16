import java.util.Scanner;

public class Palindrome {
    public static boolean palinString(String str, int left, int right){
        if(right-left == 1 | right-left == 2){
            return true;
        }
        
        else{
            if(str.charAt(left) == str.charAt(right)){
                return palinString(str, left+=1, right-=1);
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string...\n");
        String str = sc.nextLine();
        System.out.println(palinString(str,0, str.length()-1));
    }
}