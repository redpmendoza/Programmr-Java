import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {

	Scanner scanner=new Scanner(System.in);

	int maxNumber=0;
	System.out.println("Enter the first no:");
	int number1=scanner.nextInt();
	System.out.println("Enter second number:");
	int number2=scanner.nextInt();

	// Start of Solution
    if(number1 > number2){
        maxNumber = number1;
    }
    else{
        maxNumber = number2;
    }
	// End of Solution

	System.out.println("The Maximum No is:\n"+maxNumber);


	}
}