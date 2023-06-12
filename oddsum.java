import java.util.Scanner;

public class oddsum{
    public static void main(String[] args){
        
        long max=0;
        long sum = 0;
 
        System.out.println("Enter Maximum No.:");
        Scanner sc = new Scanner(System.in);
        max = sc.nextInt();

        // Start of Solution
        for(int ctr = 1; ctr < max; ctr++){
            if(ctr % 2 != 0){
                sum += ctr;
            }
        }
        System.out.print(sum);
        // End of Solution

    }
}
