import java.io.*;

public class FindVowels{
	public static void main(String a[]) throws Exception{
	    
        String line; 
        int number_of_vowels,uc,lc,uv,lv;
        uc=lc=uv=lv=0;
        System.out.println("Enter your sentence :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        line=br.readLine();

        // Start of Solution
        for(int ctr = 0; ctr < line.length(); ctr++){
            char let = line.charAt(ctr);
            
            if(let == 'A' || let == 'a' || let == 'E' || let == 'e' || let == 'I' || let == 'i' || let == 'O' || let == 'o' || let == 'U' || let == 'u'){
                
                if(Character.isUpperCase(let)){
                    uv++;
                }
                else{
                    lv++;
                }
            }
            else{

                if(Character.isLetter(let)){
                    if(Character.isUpperCase(let)){
                        uc++;
                    }
                    else{
                        lc++;
                    }
                }
            }
        }
        // End of Solution
                
        System.out.println("Uppercase Consonants = "+ uc + ".") ;
        System.out.println("Lowercase Consonants = "+ lc + ".");
        System.out.println("Uppercase Vowels = "+ uv + ".");
        System.out.println("Lowercase Vowels = "+ lv + ".");
        number_of_vowels=uv+lv;
        System.out.println("Number of vowels = "+ number_of_vowels);

	}
}