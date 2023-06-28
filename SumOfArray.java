import java.util.Scanner;  

class SumOfArray{  
    public static void main(String args[]){
        
        Scanner scanner=new Scanner(System.in);  
        int sum=0;  
        int a[];
        a=new int[10]; 
 
        System.out.println("Enter elements of array :"); 
        for(int i=0;i<10;i++){ 
            a[i]=scanner.nextInt(); 
            if(i==9)
                break; 
        } 
        
        // Start of Solution
        for(int ctr = 0; ctr < 10; ctr++){
            sum += a[ctr];
        }
        // End of Solution
  
        System.out.println("Sum of elements of the array:"+sum);   
    
    }  
}  