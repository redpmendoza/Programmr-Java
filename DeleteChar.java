import java.io.*;

public class DeleteChar{
	public static void main(String a[]) throws Exception{
	    
        String s; 
        char deletechar;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         	
	    System.out.println("Enter a string:"); 	
	  	s=br.readLine();
        System.out.println("Enter Character which you want to delete:");
        deletechar= (char)br.read() ;
 
        // Start of Solution
        String str = "";
        
        for(int ctr = 0; ctr < s.length(); ctr++){
            if(s.charAt(ctr) != deletechar){
                str = str + s.charAt(ctr);
            }
        }
        
        System.out.println(str);
        // End of Solution
         
    }
}