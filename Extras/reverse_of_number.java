// Write a java program to find reverse of a given number.

import java.util.Scanner;

class reverse_of_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, reverse = 0;
        System.out.println("enter the value of n ");
        n = sc.nextInt();

        while (n > 0) {
            reverse = (reverse * 10) + n % 10;
            n = n / 10;
        }
        System.out.println("reverse = " + reverse);
        sc.close();
    }

}
