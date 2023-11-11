import java.util.Scanner;

class shape_printing_7{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int n,i,j;
      System.out.println(" enter the number value of n ");
      n=sc.nextInt();

      for(i=1;i<=n;i++)
      {
        for(j=i;j<=n;j++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
      }
      sc.close();

    }
} 
    

