import java.util.*;

class WhileloopTest{
    public static void main(String arg[]){

    int size;
    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter the size:");
    size=scanner.nextInt();
    System.out.println("Numbers in descending order are:");

    // Start of Solution
    while(size != 0){
        System.out.println(size);
        size--;
    }
    // End of Solution
    
    }
}