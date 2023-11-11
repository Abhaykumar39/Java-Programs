package String_Question;

import java.util.Scanner;

public class sum_of_string {

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0, ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                if (sum > 0) {
                    sum = sum * 10 + (c - '0');
                }
                 else
                    sum = c - '0';
            } 
            else {
                ans += sum;
                sum = 0;
            }
        }
        ans += sum;
        System.out.println(ans);
            sc.close();}}
