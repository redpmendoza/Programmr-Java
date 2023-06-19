import java.util.Scanner;

class PrintTriangle2{
    public static void main(String arg[]){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the size:");
    int size=scanner.nextInt();
    
    System.out.println("Triangle is:");

    // Start of Solution
    for(int ctr = 1; ctr <= size; ctr++){
        for(int ctr2 = 1; ctr2 <= ctr; ctr2++){
            System.out.print(ctr);
        }
        System.out.println("");
    }
    // End of Solution

    }
}
