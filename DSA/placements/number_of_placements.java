package placements;
import java.util.*;
public class number_of_placements{
    public int pno,pyear;
    public void Read_data(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter placement year: ");
        pyear=sc.nextInt();
        System.out.print("Enter no. of placements in "+pyear+": ");
        pno=sc.nextInt();
        sc.close();
    }
}