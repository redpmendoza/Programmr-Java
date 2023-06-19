import java.util.Scanner;

class PrintTriangle{
    
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=scanner.nextInt();
        System.out.println("Traingle is:");
        print_(size);
    }

    // Start of Solution
    public static void print_(int n){
        for(int ctr = 0; ctr < n; ctr++){
            for(int ctr2 = 0; ctr2 <= ctr; ctr2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // End of Solution
    
}
