import java.io.*;

class occurence{
    public static void main(String arg[])throws Exception{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number:");
        int number =Integer.parseInt(br.readLine());

        System.out.println("Enter number to search:");
        int n=Integer.parseInt(br.readLine()); 
        
        // Start of Solution
        String num = number + "";
        String find = n + "";
        int count = 0;
        
        for(int ctr = 0; ctr < num.length(); ctr++){
            String f = num.charAt(ctr) + "";
            if(f.equals(find)){
                count++;
            }
        }
        
        System.out.println("Number of occurence of given number is:\n" + count);
        // End of Solution

    }
} 