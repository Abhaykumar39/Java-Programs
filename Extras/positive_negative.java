// write a program to check whether the number is positive or negative.

import java.util.Scanner;

class positive_negative
{
    public static void main(String[] args)
    {
        int a;

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number ");
        a=sc.nextInt();

        if(a>0)
        {
            System.out.println("Positive number " +a);
        }
        else
        {
            System.out.println("Negative number "+a);
        }
        sc.close();
    }
}