import java.io.*;

class touppercase{
  public static void main(String[] args) throws IOException{
   
    String str;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a string:"); 
    str = br.readLine();

    // Start of Solution
    str = str.toUpperCase();
    
    System.out.println(str);
    // End of Solution
    
  }
}