// Write a java program to find product of digit of a given number.

import java.util.Scanner;

class product_of_digit {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n, product = 1;

        System.out.println(" enter the value of n ");
        n = sc.nextInt();

        while (n > 0) {
            product = product * (n % 10);
            n = n / 10;
        }
        System.out.println(" Product = " + product);
        sc.close();

    }

}
