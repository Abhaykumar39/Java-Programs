import java.util.Scanner;

class shape_printing_6{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int n,i,j;
      System.out.println(" enter the number value of n ");
      n=sc.nextInt();

      for(i=n;i>=0;i--)
      {
        for(j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
      }
      sc.close();
    
    }
} 
    


