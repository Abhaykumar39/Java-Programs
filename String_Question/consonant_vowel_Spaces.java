package String_Question;
import java.util.Scanner;

public class consonant_vowel_Spaces {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str;
        int vowel = 0, consonant = 0, space = 0;
        System.out.println("Enter the String: ");
        str = sc.nextLine(); 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else if (ch == ' ') {
                space++;
            } else {
                consonant++;
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
        System.out.println("Spaces: " + space);
        sc.close();
    }
}
