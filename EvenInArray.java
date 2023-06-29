import java.util.Scanner; 

class Challenge{ 
    public static void main(String args[]){ 
        
        Scanner scanner=new Scanner(System.in); 
        int [] arr = new int[5];
        
        // Start of Solution
        for(int ctr = 0; ctr < 5; ctr++){
            arr[ctr] = scanner.nextInt();
        }
        
        int check = 0;
        
        for(int ctr = 0; ctr < 5; ctr++){
            if(arr[ctr] % 2 == 0){
                System.out.println(arr[ctr]);
                check++;
            }
        }
        
        if(check == 0){
            System.out.println("Even number not found in array.");
        }
        // End of Solution  
        
    } 
} 