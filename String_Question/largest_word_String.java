package String_Question;
import java.util.Scanner;
public class largest_word_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s1 = sc.nextLine();

        String arr[] = s1.split(" ");
        String largestWord = "";

        for (String a : arr) {
            if (a.length() > largestWord.length()) {
                largestWord = a;
            }
        }
            System.out.println("The largest word is: " + largestWord);
            sc.close();
    }
}

