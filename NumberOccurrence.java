import java.io.*;
import java.util.*;

public class NumberOccurrence{
	public static void main(String a[]) throws Exception{
         
        int[] arr = new int[8];
        int countOccurrence=0;
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<8;i++){
            System.out.println("Enter Number ["+i+"]:");
            arr[i]=scan.nextInt();   
        }
        System.out.println("Enter a number which exist in the array:");
        int number=scan.nextInt(); 
    
        // Start of Solution
        for(int ctr = 0; ctr < arr.length; ctr++){
            if(arr[ctr] == number){
                countOccurrence++;
            }
        }
        // End of Solution
        
        System.out.println("Occurrence of "+number+" :");
        System.out.println(countOccurrence);
	    
	}
} 