package String_Question;
import java.util.Scanner;
 class remove_white_spaces  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.println("Enter the string:");
        s1 = sc.nextLine();
        String s2 = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch!=' ') {
                s2 = s2 + ch;
            }
        }

        System.out.println("String after removing whitespaces: " + s2);
        sc.close();
    }
}
