import java.util.*; 

public class AvgPositiveNegative{
	public static void main(String a[]) throws Exception{
        int[] arr = new int[10];

        double avg_pos=0.0,avg_neg=0.0;
        Scanner scan=new Scanner(System.in);
        
        // Start of Solution    
        int n = 0, p = 0;
        
        for(int ctr = 0; ctr < 10; ctr++){
            System.out.println("Enter Number [" + ctr + "]:");
            arr[ctr] = scan.nextInt();
            
            if(arr[ctr] < 0){
                avg_neg += arr[ctr];
                n++;
            }
            else{
                avg_pos += arr[ctr];
                p++;
            }
        }

        avg_neg = avg_neg / n;
        avg_pos = avg_pos / p;
        // End of Solution
        
        System.out.println("positivenumbers:\n"+avg_pos);
        System.out.println("negativenumbers:\n"+avg_neg);
        
    }
}
