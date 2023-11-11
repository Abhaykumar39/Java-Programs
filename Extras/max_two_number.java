// Write a program to find the maximum between two numbers.

import java.util.Scanner;

class max_two_number
{
    public static void main(String[] args)
    {
        int a,b;

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the first numbers ");
        a=sc.nextInt();
        System.out.println("enter the second number ");
        b=sc.nextInt();

        if(a>b)
        {
            System.out.println("maximum number = " +a);
        }
        else
        {
            System.out.println("minimum number = "+b);
        }
        sc.close();
    }
}
