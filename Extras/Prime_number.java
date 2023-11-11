// Write a Java a program to check whether a number is Prime or not.

import java.util.Scanner;

class Prime_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i = 1, count = 0;
        System.out.println(" enter the number ");
        n = sc.nextInt();

        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println(" Prime number ");
        } else {
            System.out.println(" Not a Prime number ");
        }
        sc.close();
    }
}
// for(i=1;i<=n;i++) 
// {
//     if(n%i==0)
//     {
//         count++;
//     }
// }
