// Write  a  java program to find factorial of a given a  number..

import java.util.Scanner;

class Factorial_number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,factorial = 1;
        
        System.out.println(" enter the value of n " );
        n=sc.nextInt();

        while(n>0)
        {
            factorial=factorial * n;
            n=n-1;
        }
        System.out.println("factorial = "+ factorial);
        sc.close();
    }
    
}
