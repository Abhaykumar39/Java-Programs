package String_Question;
import java.util.Scanner;

 public class first_word_uppercase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        String ans = "";
        for (String a : arr) {
            ans = ans + (a.charAt(0) + "").toUpperCase();
            for (int i = 1; i < a.length() - 1; i++) {

                ans = ans + a.charAt(i);

            }

            ans = ans + (a.charAt(a.length() - 1) + "").toUpperCase();

            ans = ans + " ";
        }
        System.out.print("The New String Is: " + ans);
        sc.close();}}
