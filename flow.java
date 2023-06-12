class flow {
    public static void main(String[] args) {

    int num = 11;
    
    // Start of Solution
    int count = 0;
    for(int ctr = 1; ctr <= num; ctr++){
        if(num % ctr == 0){
            count++;
        }
    }
    
    if(count >= 2){
        System.out.println("The number is prime.");
    }
    else{
        System.out.println("The number is not prime.");
    }
    // End of Solution

    }
}