import java.util.Scanner;

class shape_printing_20{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int n,i,j,space;
      System.out.println(" enter the value of n ");
      n=sc.nextInt();

      for(i=n;i>=1;i--)
      {
        for(space=1;space<=n-i;space++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=2*i-1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
      }
      sc.close();
    }
} 
