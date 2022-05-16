import java.util.Scanner;

public class Permutation{

    public static void permutationStr(char[] str, int n, int k, String prefix){
        if(k==0){
            System.out.println(prefix);
            return ;
        }

        else{
            for(int i = 0;i<n;++i){
                String newStr = prefix+str[i];
                permutationStr(str, n, k-1, newStr);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string...\n");
        String str = sc.nextLine();
        permutationStr(str.toCharArray(), str.length(), 3, "");
    }
}