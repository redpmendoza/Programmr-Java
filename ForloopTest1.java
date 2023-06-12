import java.util.Scanner;

class ForloopTest1{
    public static void main(String arg[]){
        
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter the size of the numbers:");
    int size=scanner.nextInt();

    // Start of Solution
        for(int ctr = 0; ctr <= size; ctr++){
        if(ctr % 2 == 0){
            System.out.println(ctr);
        }
    }
    // End of Solution

    }
}
