import java .util.Scanner;
 class prime
 {
    int n;
    void getdata()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter te number : ");
        n=sc.nextInt();
        sc.close();
    }
    void putdata()
    {
        int i,count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
            if(count==2)
            {
                System.out.println(" Prime number ");
            }
            else
            {
                System.out.println(" Not a prime number ");
            }
        
    }
    public static void main(String args[])
    {
        prime aa = new prime();
        aa.getdata();
        aa.putdata();
    }
 }
