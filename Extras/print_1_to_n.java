// Write a program to print number from 1 to n; 

import java.util.Scanner;

class print_1_to_n {
    public static void main(String args[]) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n ");
        n = sc.nextInt();
        i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;

        }
        sc.close();

    }
}
// for (int i = 1; i<=n; i++)
// {
//     System.out.print(i + " ");
// }