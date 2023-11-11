package String_Question;
import java.util.Scanner;

public class Remove_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.println("Enter the string:");
        s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        String s2 = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                s2 = s2 + ch;
            }
        }

        System.out.println("String after removing vowels: " + s2);
        sc.close();
    }
}
