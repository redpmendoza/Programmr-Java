import java.io.*;

class RemoveVowels{ 
    public static void main(String args[])throws IOException{ 
        
        InputStreamReader is=new InputStreamReader(System.in);   
        BufferedReader br=new BufferedReader(is);  
 
        String newstr=""; 
        char ch=' '; 
 
        System.out.println("Enter the Word:"); 
        String str=br.readLine(); 
 
        // Start of SOlution
        for(int ctr = 0; ctr < str.length(); ctr++){
            ch = str.charAt(ctr);
            if(ch != 'A' && ch != 'a' && ch != 'E' && ch != 'e' && ch != 'I' && ch != 'i' && ch != 'O' && ch != 'o' && ch != 'U' && ch != 'u'){
                newstr = newstr + ch;
            }
        }
        // End of Solution
 
        System.out.println("Edited Word:"+newstr);  
        
    } 
} 