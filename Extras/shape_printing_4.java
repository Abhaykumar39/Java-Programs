import java.util.Scanner;

class shape_printing_4{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int n,i,j;
      System.out.println(" enter the number value of n ");
      n=sc.nextInt();

      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
            System.out.print((i+j)+" ");
        }
        System.out.println();
      }
      sc.close();

    }
} 
    

