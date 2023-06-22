import java.util.Scanner;

class SwitchCaseTest{
    public static void main(String arg[]){

    String choice="";

    //below code takes input from user 
    System.out.println("Enter your choice:");
    Scanner scanner=new Scanner(System.in);
    int entered_number=scanner.nextInt(); 

    //Please complete the switch case block given below
    //such that choice is set to the number being inputted

    // Start of SOlution
    switch(entered_number){
        case 1:
            choice = "one";
        break;
        case 2:
            choice = "two";
        break;
        case 3:
            choice = "three";
        break;
        default:
            choice = "unknown";
        break;
    }
    // End of Solution

    System.out.println("Your choice was:\n"+choice);

    }
}


