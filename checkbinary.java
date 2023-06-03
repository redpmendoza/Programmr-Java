import java.util.Scanner;

public class checkbinary{
    public static void main(String[] args){
        
        int num;
        System.out.println("Enter a number:");
	    Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
	
	    // Start of Solution
        String inp = num + "";
        boolean check = false;
        
        for(int ctr = 0; ctr < inp.length(); ctr++){
            if(!(inp.charAt(ctr) + "").equals("1") && !(inp.charAt(ctr) + "").equals("0")){
                check = true;
            }
        }
        
        if(check){
            System.out.println("Not Binary");
        }
        else{
            System.out.println("Binary");
        }
        // End of Solution
        
    }
}