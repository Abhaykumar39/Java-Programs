// Write a program to find the maximum between three numbers.

import java.util.Scanner;

class max_three_number
{
    public static void main(String[] args)
    {
        int a,b,c;

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the first numbers ");
        a=sc.nextInt();
        System.out.println("enter the second number ");
        b=sc.nextInt();
        System.out.println("enter the third number ");
        c=sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("maximum number = " +a);
        }
        else if (b>a && b>c)
        {
            System.out.println("maximum number = "+b);
        }
        else
        {
             System.out.println("maximum number = "+c);
        }
        sc.close();
    }
}
