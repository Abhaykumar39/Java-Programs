// Write a Java Program to check whether a number is armstrong or not.

import java .util.Scanner;

class Armstrong_number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,a,b,i,count=0,sum=0;

        System.out.println(" enter the number ");
        n=sc.nextInt();

        a=n;
        b=n;
        while(a>0)
        {
            count++;
            a=a/10;
        }
        while(n>0)
        {
            int product = 1;
           int digit=n%10;
            for(i=1;i<=count;i++)
            
                product=product*digit;
                sum=sum+product;
                n=n/10;
            
        }
        if(sum==b)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println(" Not a Armstrong number");
        }
        sc.close();
    }
    
}
