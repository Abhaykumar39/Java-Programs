package String_Question;
import java.util.Scanner;
import java.util.Arrays;
public class anagrams_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        String s2;
        System.out.println("Enter the first string:");
        s1 = sc.nextLine();
        System.out.println("Enter the second string:");
        s2 = sc.nextLine();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        if (c1.length != c2.length) {
            System.out.println("Not anagrams");
        } else {
            Arrays.sort(c1);
            Arrays.sort(c2);

            if(Arrays.equals(c1, c2)) {
                System.out.println("Strings are anagrams");
            } else {
                System.out.println("Strings are not anagrams");
            }
            sc.close();
        }
    }
}