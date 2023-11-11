// write a program to check the number is even or odd.

import java.util.Scanner;

class odd_even
{
    public static void main(String[] args)
    {
        int a;

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number ");
        a=sc.nextInt();

        if(a%2==0)
        {
            System.out.println("Even number " +a);
        }
        else
        {
            System.out.println("Odd number "+a);
        }
        sc.close();
    }
}
