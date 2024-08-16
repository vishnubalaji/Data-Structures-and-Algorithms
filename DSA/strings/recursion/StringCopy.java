import java.util.Scanner;

public class StringCopy{

    public static String copy(String original, String copied, int length){
        if(length!=0){
            copied = copied+original
            return copy();
        }
        else{
            return "";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to be copied");
        String original = sc.nextLine();
        String copied = "";

        System.out.println("The value in the original variable is " + original + " and the value of the copied variable is "+copied);

        copy(original, copied, original.length());


    }
}