import java.io.*;  
  
public class PalindromString{  
	public static void main(String a[]) throws Exception{  
           
           String strn;  
           int flag=0;  
           
           System.out.println("Enter the string:");  
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
           strn=br.readLine(); 
           
           System.out.println("Result string is:");  
           
           //Start of Solution
           String inp = "";
           
            for(int ctr = 0; ctr < strn.length(); ctr++){
                inp = strn.charAt(ctr) + inp;
            }
            
            if(inp.equals(strn)){
                flag = 1;
            }
            
            // End of Solution

           if(flag==1)  
               System.out.print("palindrome");  
           else   
               System.out.print("not a palindrome2");  
               
    }  
}  
