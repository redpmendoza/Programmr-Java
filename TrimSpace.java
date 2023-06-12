
import java.util.*;

public class TrimSpace{
	public static void main(String a[]) throws Exception{
	    
        Scanner input = new Scanner(System.in);	
	    System.out.print("Enter a string:\n"); 	
	    String s; 	 
	    s=input.nextLine();	
	    String Resultstr="";	  

        // Start of Solution
        for(int ctr = 0; ctr < s.length(); ctr++){
            String c = s.charAt(ctr) + "";
            
            if(!c.equals(" ")){
                Resultstr += c;
            }
        }
        // End of Solution
	
       System.out.println("Result string:\n"+ Resultstr);
       
    }
}