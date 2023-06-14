import java.util.Scanner;

public class sampling{
    public static void main(String[] args){
        
        int M,N;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and how many last samples u want:");
        
        N = sc.nextInt();
        M = sc.nextInt();

        // Start of Solution
        for(int ctr = 0; ctr < M; ctr++){
            N--;
            System.out.print(N + " ");
        }
        // End of Solution

    }
}