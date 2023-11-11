import java.util.Scanner;

public class reverse_each_string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the string");
        s = sc.nextLine(); // Trim leading and trailing spaces
        int i, j, k;
        i = s.length() - 1;
        while (i >= 0) {
            j = i;
            while ((j >= 0) && (s.charAt(j) != ' ')) {
                j--;
            }
            k = j + 1;
            while (k <= i) {
                System.out.print(s.charAt(k));
                k++;
            }
            System.out.print(" "); // Add a space between reversed words
            i = j - 1;
            sc.close();
        }
    }
}
