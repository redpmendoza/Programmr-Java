import java.util.*;

public class ConvertInSeconds{
	public static void main(String a[]) throws Exception{
	    
        int hours=0,minutes=0,seconds=0,number_of_seconds=0;
                 
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of Hours:");
        hours=scan.nextInt();
         
        System.out.println("Enter number of Minutes:");
        minutes=scan.nextInt();
         
        System.out.println("Enter number of Seconds:");
        seconds=scan.nextInt();

        // Start of Solution
        number_of_seconds = (hours * 60 * 60) + (minutes * 60) + seconds;
        // End of Solution
        
        System.out.println("Total number of seconds:");
        System.out.println(number_of_seconds);
    }
}