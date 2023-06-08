import java.util.Scanner;

public class leapyearcheck{ 
    public static void main(String[] args) { 
        
        int year = 0;
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Year:"); 
        year = sc.nextInt();
        
        // Start of Solution
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("Leap");
        }
        else{
            System.out.println("Not leap");
        }
        // End of Solution

    }
}