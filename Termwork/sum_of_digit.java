import java.util.Scanner;
class sum_of_digit {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n,sum=0;

        System.out.println("enter the value of n ");
        n=sc.nextInt();
        while(n>0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("Sum = "+ sum);
        sc.close();
    }
    
}