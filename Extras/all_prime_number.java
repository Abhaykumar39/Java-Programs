// Write a program to print all prime number between 1 to 100.

class all_prime_number {
    public static void main(String args[])
    {
        int i,j,count;
        for(i=1;i<=100;i++)
        {
            count=0;

        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                count=count+1;
            }
        }
        if(count==2)
        {
            System.out.print(" "+  i);
        }

    }

}
}
