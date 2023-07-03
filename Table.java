import java.util.Scanner; 

class Table{ 
    public static void main(String args[]){ 
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter a number:"); 
        int num1=scanner.nextInt(); 
        System.out.println("Enter number of multiples:"); 
        int num2=scanner.nextInt(); 
        
        // Start of Solution
        for(int ctr = 1; ctr <= num2; ctr++){
            System.out.println(num1 + "*" + ctr + "=" + (num1*ctr));
        }
        // End of Solution
  
    } 
} 