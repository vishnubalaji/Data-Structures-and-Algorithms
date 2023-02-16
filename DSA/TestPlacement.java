import placements.number_of_placements;
import java.util.*;
public class TestPlacement{
    public static void main(String args[]){
        int totalp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total no. of years: ");
        int nyr=sc.nextInt();
        number_of_placements[] OBJ=new number_of_placements[5];
        for(int i=0;i<nyr;i++){
            OBJ[i] = new number_of_placements();
            OBJ[i].Read_data();
            totalp+=OBJ[i].pno;
        }
        System.out.println("PLACEMENTS:");
        for(int i=0;i<nyr;i++){
            System.out.println("\nYear: "+OBJ[i].pyear+"\nNo. of placements: "+OBJ[i].pno);
        }
        System.out.println("TOTAL NO. OF PLACEMENTS: "+totalp);
        sc.close();
    }
}