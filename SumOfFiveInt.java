import java.util.Scanner; 
 
public class SumOfFiveInt { 
	public static void main(String[] args) { 
	    
		int total = 0; 
		int number;   
		Scanner scan = new Scanner(System.in);
		
		// Start of Solution
		int arr[] = new int[5];
        for(int ctr = 0; ctr < 5; ctr++){
            System.out.print("Enter an integer: ");
            arr[ctr] = scan.nextInt();
            total += arr[ctr];
        }
		// End of Solution
		
		System.out.println("Total is: "+ total); 
         
	} 
} 