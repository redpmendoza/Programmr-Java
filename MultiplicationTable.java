import java.util.*;

public class MultiplicationTable{
	public static void main(String a[]) throws Exception{
	    
        // Start of Solution
	    Scanner in = new Scanner(System.in);
	    
	    int n;
	    
	    n = in.nextInt();
	    
	    for(int ctr = 1; ctr < 11; ctr++){
	        System.out.println(ctr * n);
	    }
        // End of Solution

    } 
}