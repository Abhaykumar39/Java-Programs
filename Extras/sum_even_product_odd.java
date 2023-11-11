// write a java a program to find sum of even and product of odd digits.

import java.util.Scanner;

class sum_even_product_odd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,sum=0,product=1;

        System.out.println("enter the value of n ");
        n=sc.nextInt();

        while(n>0)
        {
            if(n%2==0)
            {
                sum = sum + n%10;
                n=n/10;
            }
            else
            {
                product = product * n%10;
                n=n/10;
            }
            
        }
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        sc.close();
    }
    
}
