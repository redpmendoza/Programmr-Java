import java.io.*;

class coladd{
    public static void main(String arg[])throws Exception{

    int rows=10,cols=10;
    double a[][]=    {{12,62,16,34,33,48,35,63,35,11},{34,35,61,37,36,12,33,12,12,77},
        {37,58,95,24,36,41,23,45,12,33},{23,19,13,22,31,23,51,23,55,33},{32,33,88,22,31,23,41,23,55,33},
        {54,54,33,22,31,23,14,23,55,33},{37,76,33,22,31,23,22,23,55,33},{43,38,33,22,31,23,36,23,55,33},
        {13,35,32,22,31,23,87,23,55,33},{22,59,13,22,31,23,49,23,55,33}};
        
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int sum=0;
    
    System.out.println("Enter the column:");
    int col=Integer.parseInt(br.readLine());

    System.out.println("Sum of the given column is:");
    
    // Start of Solution
    for(int ctr = 0; ctr < 10; ctr++){
        for(int ctr2 = 0; ctr2 < 10; ctr2++){
            if(col == ctr2){
                sum += a[ctr][ctr2];
            }
        }        
    }
    System.out.print(sum);
    // End of Solution
   
    }
}   