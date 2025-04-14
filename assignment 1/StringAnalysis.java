import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word;
        int vowels = 0, consonants = 0, numbers = 0, specialCharacters = 0;
        
        System.out.print("Enter a string: ");
        word = scanner.nextLine();

        for(int i=0; i<word.length(); i++){
            char c = word.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;
            else if(c >= '0' && c <= '9') numbers++;
            else if(c == '@' || c == '!' || c == '#' || c == '$' ||
                    c == '%' || c == '^' || c == '&' || c == '*' || 
                    c == ' ' || c == ':' || c == ',' || c == '?' ||
                    c == '.' || c == '/' || c == '<' || c == '>') specialCharacters++;
            else consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + numbers);
        System.out.println("Special Characters: " + specialCharacters);
        scanner.close();
    }
}