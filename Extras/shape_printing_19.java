import java.util.Scanner;

class shape_printing_19{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int n,i,j,space;
      System.out.println(" enter the value of n ");
      n=sc.nextInt();

      for(i=1;i<=n;i++)
      {
        for(space=1;space<=n-i;space++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=2*i-1;j++)
        {
            System.out.print(i);
        }
        System.out.println();
      }
      sc.close();

    }
} 