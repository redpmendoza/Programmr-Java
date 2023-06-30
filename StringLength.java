import java.util.Scanner; 
 
class StringLength { 
	public static void main(String args[]) { 
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a string:"); 
		
		// Start of Solution
		String inp = scanner.nextLine();
	
		int length = inp.length();
		// End of Solution
 
		System.out.println("Length of the string is:" + length); 
 
	} 
} 