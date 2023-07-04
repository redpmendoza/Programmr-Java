import java.util.Scanner;

public class ArithmeticOperators {

    public ArithmeticOperators(){
        calculateValues();
    }

	public static void main(String[] args) {
		new ArithmeticOperators();
	}

	public void calculateValues() {
	    
		int a, b;
		int resulta, results, resultm;
		float resultd;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a:");
		a = sc.nextInt();
		System.out.print("Enter b:");
		b = sc.nextInt();
		
		// Start of Solution
		resulta = a + b;
		results = a - b;
		resultm = a * b;
		resultd = a / b;
		// End of Solution

		System.out.println("The result of adding is " + resulta);
		System.out.println("The result of subtracting is " + results);
		System.out.println("The result of multiplying is " + resultm);
		System.out.println("The result of dividing is " + resultd);
		
	}
}