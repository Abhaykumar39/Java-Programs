import java.util.Scanner;
class Palindrome
{
     public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n,reverse = 0, a;
        
        System.out.println("Enter the value of n ");
        n=sc.nextInt();
        a=n;
        while(n>0)
        {
            reverse = (reverse*10)+ n%10;
            n=n/10; 
        }
        if(a==reverse)
        {
            System.out.println(" palindrone number ");
        }
        else
        {
            System.out.println(" Not a palindrone number ");
        }
        sc.close();
    }
}
