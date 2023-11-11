// Write a program to find sum of first n natural number.

import java.util.Scanner;

class sum_of_natural_number {
   public static void main(String args[]) {
      int i, n, sum = 0;
      Scanner sc = new Scanner(System.in);

      System.out.println("enter the value of n ");
      n = sc.nextInt();
      i = 1;
      while (i <= n) {
         sum = sum + i;
         i++;

      }
      System.out.println("Sum = " + sum);
      sc.close();
   }

}
// for(i=1;i<=n;i++)
// {
//    sum=sum+i;
// }
// System.out.println("sum="+sum);
// }
