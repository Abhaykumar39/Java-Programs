import java.util.Scanner;

class shape_printing_8{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int n,i,j,k=1;
      System.out.println(" enter the number value of n ");
      n=sc.nextInt();

      for(i=n;i>=1;i--)
      {
        for(j=1;j<=i;j++)
        {
            System.out.print((k+j)+" ");
        }
        System.out.println();
        k++;
      }
      sc.close();

    }
} 
    

