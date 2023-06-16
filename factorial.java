import java.io.*;
import java.util.Scanner;

public class factorial{
  public static void main(String[] agrs){
    
    int prod=1,num;
	System.out.println("Enter a number:");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	
    // Start of Solution
    for(int ctr = 1; ctr <= num; ctr++){
        prod *= ctr;
    }
    
    System.out.println("Factorial is:" + prod);
    // End of Solution
    
    }
}