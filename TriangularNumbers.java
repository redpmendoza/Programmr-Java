//Start of Solution
import java.util.Scanner;

public class TriangularNumbers{
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int num = 0;

        for(int ctr = 0; ctr < n; ctr++){
            for(int ctr2 = 0; ctr2 <= ctr; ctr2++){
                num++;
                System.out.print(num + "_");
            }
            System.out.println();
        }

    }
}
// End of Solution